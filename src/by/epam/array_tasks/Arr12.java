package by.epam.array_tasks;
//12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера
//которых являются простыми числами.

public class Arr12 {
    public static double task(double[] arr) {
        double sum = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j == j) {
                    continue;
                }
                flag = 1;
            }
            if(flag == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
