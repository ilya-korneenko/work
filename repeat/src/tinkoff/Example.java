package tinkoff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static double mathInterpretator(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean view(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                        // сложение
                    if (view('+')) x += parseTerm();
                        // вычитание
                    else if (view('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                        //умножение
                    if (view('*')) x *= parseFactor();
                        //деление
                    else if (view('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (view('+')) {
                    return parseFactor();
                }
                if (view('-')) {
                    return -parseFactor();
                }

                double x;
                int startPos = this.pos;
                if (view('(')) {
                    x = parseExpression();
                    view(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (view('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
//
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        if(pattern.matcher(str).find()){
            System.out.println("Wrong");
        }
        System.out.println(mathInterpretator(str));
    }



}

