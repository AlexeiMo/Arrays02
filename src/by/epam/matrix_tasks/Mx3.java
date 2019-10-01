package by.epam.matrix_tasks;
//3. Дана матрица. Вывести на экран первый и последний столбцы

public class Mx3 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                if(j == 0 || j == mx[i].length-1) {
                    System.out.print(mx[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}