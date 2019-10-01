package by.epam.array_tasks;
//11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0
//< L < М-1)

public class Arr11 {
    public static void task(int[] arr, int m, int l) {
        for (int elem : arr) {
            if(elem%m == l) {
                System.out.println(elem);
            }
        }
    }
}
