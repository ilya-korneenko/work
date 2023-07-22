package homework.hw_2.sorts;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class SortsUtils {
    /*
    сортировка пузырьком
     */
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /*
    функция шейкер-сортировки
     */
//    public int[] shake(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        int flag = 1;
//
//        while ((left < right) && flag > 0) {
//            flag = 0;
//            for (int i = left; i < right; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    flag = 1;
//                }
//            }
//            right--;
//            for (int i = right; i > left; i--) {
//                if (arr[i - 1] > arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    flag = 1;
//                }
//            }
//            left++;
//        }
//        return arr;
//    }

    public int[] shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (arr[i - 1] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
