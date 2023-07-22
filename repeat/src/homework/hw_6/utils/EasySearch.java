package homework.hw_6.utils;

import homework.hw_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private final String[] symbols = {".", ",", "...", "'", "\"", "!", "@", "#", "№", "%",
            "^",":", ";" , "?!", "???", "$", "?", "*", " ", "(", ")", "-", "_", "+", "="};


    /**
     * метод считает сколько раз слово встретилось в тексте
     * count - количество повторений
     * startWord - index 1-й буквы, слова которого мы ищем
     * length - длина строки
     *
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return сколько раз в тексте встретилось передаваемое слово
     */
    @Override
    public long search(String text, String word) {

        int count = 0;
        int startWord;
        int lengthText = 0;

        while (true) {
            startWord = text.indexOf(word, lengthText);

            if (startWord > -1) {
                if(checkCorrectsWord(text,word,startWord)){
                count++;
                startWord += countLetters(word);
                lengthText = startWord;}
                else {
                    startWord += countLetters(word);
                    lengthText =startWord;
                }

            } else {
                if (count == 0) {
                    return 0;
                } else {
                    return count;
                }
            }
        }
    }

    private boolean checkCorrectsWord(String text, String word, int startIndex ) {
        boolean start = false;
        boolean end = false;

        for (int i = 0; i < symbols.length; i++) {
            char a =text.charAt(startIndex-1);
            char b = symbols[i].charAt(0);
            if (a == b) {
                start = true;
                break;
            }
        }

        for (int i = 0; i < symbols.length; i++) {
            char a =text.charAt(startIndex + countLetters(word));
            char b = symbols[i].charAt(0);
            if (a == b) {
                end = true;
                break;
            }
        }

        return start && end;
    }

    /**
     * считает количество букв в слове
     *
     * @param word передаваемое слово
     * @return количество букв в переданном слове
     */
    private int countLetters(String word) {
        return word.toCharArray().length;
    }
}
