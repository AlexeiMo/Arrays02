package by.epam.array_tasks;
// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class Arr2 {
    public static int[] task(int arr[]) {
        int j = 0;
        for (int elem:arr) {
            if(elem == 0) {
                j++;
            }
        }
        int[] arrRes = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arrRes[j] = i+1;
                j++;
            }
        }
        return arrRes;
    }
}
