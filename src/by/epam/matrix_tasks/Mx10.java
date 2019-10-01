package by.epam.matrix_tasks;
//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class Mx10 {
    public static void task(int[][] mx, int k, int p) {
        for (int i = 0; i < mx[k-1].length; i++) {
            System.out.print(mx[k-1][i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < mx.length; i++) {
            System.out.println(mx[i][p-1]);
        }
    }
}
