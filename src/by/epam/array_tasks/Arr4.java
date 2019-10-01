package by.epam.array_tasks;
//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class Arr4 {
    public static void task(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("This sequence is not rising");
                return;
            }
        }
        System.out.println("This sequence is rising");
    }
}
