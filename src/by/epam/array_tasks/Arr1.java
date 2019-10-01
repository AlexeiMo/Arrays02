package by.epam.array_tasks;
// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Arr1 {
    public static void task(int[] arr, int k) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            if(k%arr[i] == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
