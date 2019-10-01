package by.epam.array_tasks;
// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше -
//положительное или отрицательное.

public class Arr3 {
    public static void task(int[] arr) {
        for (int elem:arr) {
            if(elem > 0) {
                System.out.println("Positive");
                return;
            }
            else if(elem < 0){
                System.out.println("Negative");
                return;
            }
        }
        System.out.println("Array of nulls");
    }
}
