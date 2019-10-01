package by.epam.matrix_tasks;
//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше
//последнего.

public class Mx6 {
    public static void task(int[][] mx) {
        for (int i = 0; i < mx.length; i++) {
            if(i%2 == 0 && (mx[i][0] > mx[i][mx[i].length-1])) {
                for (int elem:mx[i]) {
                    System.out.print(elem + " ");
                }
                System.out.println("");
            }
        }
    }
}
