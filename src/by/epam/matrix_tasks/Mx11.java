package by.epam.matrix_tasks;
//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
//налево, вторая строка слева направо, третья строка справа налево и так далее.

public class Mx11 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            if(i%2 == 1) {
                for (int j = 0; j < mx[i].length; j++) {
                    System.out.print(mx[i][j] + " ");
                }
                System.out.println("");
            }
            else {
                for (int j = mx[i].length-1; j >= 0; j--) {
                    System.out.print(mx[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
