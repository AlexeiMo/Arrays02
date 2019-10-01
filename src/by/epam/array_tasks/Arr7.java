package by.epam.array_tasks;
//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
//этим числом. Подсчитать количество замен.

public class Arr7 {
    public static int[] task(int[] arr, int z) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }
}
