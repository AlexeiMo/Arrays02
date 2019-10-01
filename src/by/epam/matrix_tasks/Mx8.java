package by.epam.matrix_tasks;
//8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди
//элементов массива.

public class Mx8 {
    public static int task(int[][] mx) {
        int freq = 0;
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                if(mx[i][j] == 7) {
                    freq++;
                }
            }
        }
        return freq;
    }
}
