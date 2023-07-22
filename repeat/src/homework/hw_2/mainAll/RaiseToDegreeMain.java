package homework.hw_2.mainAll;

import homework.hw_2.task3.Degree;
import homework.hw_2.task3.InPut;
import homework.hw_2.task3.OutPut;

public class RaiseToDegreeMain {
    public static void main(String[] args) {
        InPut inPut = new InPut();
        Degree degree = new Degree();
        OutPut outPut = new OutPut();

        double number = inPut.number();
        int degreeOfInput = inPut.degree();
        double result = degree.raiseDegree(number, degreeOfInput);
        System.out.println(outPut.outPut(number,degreeOfInput,result));
    }
}
