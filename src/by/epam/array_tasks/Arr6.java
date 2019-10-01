package by.epam.array_tasks;
//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все
//эти числа

public class Arr6 {
    public static int task(int[] arr) {
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max-min+1;
    }
}
