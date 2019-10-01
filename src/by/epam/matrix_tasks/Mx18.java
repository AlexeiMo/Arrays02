package by.epam.matrix_tasks;
//18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx18 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            for (int j = 0; j < mx[i].length-i; j++) {
                mx[i][j] = i+1;
            }
        }
        return mx;
    }
}
