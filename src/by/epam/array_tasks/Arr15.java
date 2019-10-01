package by.epam.array_tasks;
//15. Дана последовательность действительных чисел
//a a an
//, , , 1 2
//. Указать те ее элементы, которые
//принадлежат отрезку [с, d].

public class Arr15 {
    public static void task(int[] arr, int c, int d) {
        for (int elem:arr) {
            if(elem >= c && elem <= d) {
                System.out.print(elem + " ");
            }
        }
    }
}
