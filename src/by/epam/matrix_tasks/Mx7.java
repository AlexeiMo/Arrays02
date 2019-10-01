package by.epam.matrix_tasks;
//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Mx7 {
    public static int task(int[][] mx) {
        int sum = 0;
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                if((mx[i][j] < 0) && (mx[i][j] % 2 == 1)) {
                    sum -= mx[i][j];
                }
            }
        }
        return sum;
    }
}