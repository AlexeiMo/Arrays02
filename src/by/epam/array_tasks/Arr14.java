package by.epam.array_tasks;
//14. Дан одномерный массив A[N]. Найти:
//max( , , , ) + min( , , , )

public class Arr14 {
    public static int task(int[] arr) {
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            if((i+1)%2 == 0 && arr[i] > max) {
                max = arr[i];
            }
            if((i+1)%2 == 1 && arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;
    }
}
