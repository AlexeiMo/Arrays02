package by.epam.matrix_tasks;
//4. Дана матрица. Вывести на экран первую и последнюю строки.

public class Mx4 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            if(i == 0 || i == mx.length-1) {
                for (int elem: mx[i]) {
                    System.out.print(elem + " ");
                }
                System.out.println("");
            }
        }
    }
}
