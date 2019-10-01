package by.epam.matrix_tasks;
//12. Получить квадратную матрицу порядка n:

public class Mx12 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            for (int j = 0; j < mx[i].length; j++) {
                if(i == j) {
                    mx[i][j] = i;
                }
            }
        }
        return mx;
    }
}