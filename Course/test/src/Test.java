public class Test {
    public static int comparison(int A, int B, int C) {
        if (A > B && A > C){
            return A+C;
        }else {
            return B;
        }
    }

    public static double average(int A, int B, int C){
        return ((double)A +B +C )/3;
    }
}
