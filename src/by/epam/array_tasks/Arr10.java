package by.epam.array_tasks;

public class Arr10 {
    public static void task(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > i) {
                System.out.println(arr[i]);
            }
        }
    }
}
