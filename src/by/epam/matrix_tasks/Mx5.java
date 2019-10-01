package by.epam.matrix_tasks;
//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Mx5 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            if((i+1)%2 == 0) {
                for (int elem:mx[i]) {
                    System.out.print(elem + " ");
                }
                System.out.println("");
            }
        }
    }
}
