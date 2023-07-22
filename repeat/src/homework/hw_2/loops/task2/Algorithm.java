package homework.hw_2.loops.task2;


public class Algorithm {
    /**
     *
     * @param arg массив для перемножения
     * @return результат перемножения всех чисел в массиве
     */
    public int result(int[] arg) {
        int res = 1;
        for (int j : arg) {
            res *= j;
        }
        return res;
    }
}
