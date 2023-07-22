package homework.hw_2.arraysNew;

public class deleteMain {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,10,15};
        ForOperation forOperation = new ForOperation();
        System.out.println(forOperation.outputAllElements(arr));
        System.out.println(forOperation.OutputEvenElements(arr));
        System.out.println(forOperation.OutputReverseElements(arr));
    }
}
