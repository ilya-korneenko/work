package generic;

public class CalcGeneric {
    public <T extends Number>T sum(T a, T b){

        double bDouble = b.doubleValue();
        double aDouble = a.doubleValue();
        return (T)Double.valueOf(aDouble+bDouble);
    }
}
