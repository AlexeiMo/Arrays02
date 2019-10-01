package by.epam.matrix_tasks;
//15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx15 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            mx[i][i] = n-i;
        }
        return mx;
    }
}
