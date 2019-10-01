package by.epam.array_tasks;
//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Arr9 {
    public static int[] task(int[] arr) {
        int minVal = 0, minIndex = 0;
        int maxVal = 0, maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
            if(arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        minVal = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = minVal;
        return arr;
    }
}
