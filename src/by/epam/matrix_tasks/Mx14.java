package by.epam.matrix_tasks;
//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx14 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            mx[i][n-1-i] = i+1;
        }
        return mx;
    }
}
