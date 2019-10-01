package by.epam.matrix_tasks;
//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Mx9 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                if(i == j) {
                    System.out.print(mx[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
