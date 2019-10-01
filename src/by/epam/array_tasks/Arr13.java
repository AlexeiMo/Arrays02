package by.epam.array_tasks;
//13. Определить количество элементов последовательности натуральных чисел, кратных числу М и
//заключенных в промежутке от L до N.

public class Arr13 {
    public static int task(int[] arr, int m, int l, int n) {
        int count = 0;
        for (int elem:arr) {
            if((elem == 0 || m % elem == 0) && elem >= l && elem <= n) {
                count++;
            }
        }
        return count;
    }
}
