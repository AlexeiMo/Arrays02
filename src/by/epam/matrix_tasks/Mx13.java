package by.epam.matrix_tasks;

public class Mx13 {
    public static int[][] task(int n) {
        int[][] mx = new int[n][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[n];
            for (int j = 0; j < mx[i].length; j++) {
                if(i%2 == 0) {
                    mx[i][j] = j + 1;
                }
                else {
                    mx[i][j] = mx[i].length-j;
                }
            }
        }
        return mx;
    }
}
