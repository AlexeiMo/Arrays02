package by.epam.array_tasks;
//8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Arr8 {
    public static void task(double[] arr) {
        int posCount = 0, negCount = 0, nulCount = 0;
        for (double elem:arr) {
            if(elem > 0) {
                posCount++;
            }
            else if(elem < 0) {
                negCount++;
            }
            else {
                nulCount++;
            }
        }
        System.out.println("Positive numbers: " + posCount + ".\n" +
                "Negative numbers: " + negCount + ".\n" +
                "Nulls: " + nulCount + ".");
    }
}
