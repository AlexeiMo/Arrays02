package by.epam.matrix_tasks;
//18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Mx19 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            if(i <= mx[i].length-i) {
                for (int j = i; j < mx[i].length - i; j++) {
                    mx[i][j] = 1;
                }
            }
            else {
                for (int j = mx[i].length - i-1; j < i+1; j++) {
                    mx[i][j] = 1;
                }
            }

        }
        return mx;
    }
}
