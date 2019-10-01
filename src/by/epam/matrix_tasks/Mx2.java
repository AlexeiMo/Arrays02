package by.epam.matrix_tasks;
//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Mx2 {
    public static int[][] task() {
        int[][] mx = new int[2][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[3];
            for (int j = 0; j < mx[i].length; j++) {
                mx[i][j] = 0 + (int)(Math.random()*10);
            }
        }
        return mx;
    }
}
