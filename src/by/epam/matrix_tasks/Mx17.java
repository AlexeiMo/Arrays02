package by.epam.matrix_tasks;
//17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx17 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            if(i == 0 || i == n-1) {
                for (int j = 0; j < mx[i].length; j++) {
                    mx[i][j] = 1;
                }
            }
            else {
                mx[i][0] = mx[i][n-1] = 1;
            }
        }
        return mx;
    }
}
