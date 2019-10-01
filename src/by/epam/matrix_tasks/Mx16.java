package by.epam.matrix_tasks;
//16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx16 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            mx[i][i] = (i+1)*(i+2);
        }
        return mx;
    }
}
