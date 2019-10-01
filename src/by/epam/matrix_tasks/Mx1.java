package by.epam.matrix_tasks;
//

public class Mx1 {
    public static int[][] task() {
        int[][] mx = new int[3][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[4];
            for (int j = 0; j < mx[i].length; j++) {
                if(j == 0) {
                    mx[i][j] = 1;
                }
                else {
                    mx[i][j] = 0;
                }
            }
        }
        return mx;
    }
}
