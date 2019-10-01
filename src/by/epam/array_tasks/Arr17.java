package by.epam.array_tasks;
//17. Дана последовательность целых чисел
//a a an
//, , ,
//1 2 
//. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min( , , , ) a1 a2  an
//.

public class Arr17 {
    public static int[] task(int[] arr) {
        int min = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= min) {
                min = arr[i];
                count++;
            }
        }
        int[] arrRes = new int[arr.length-count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                arrRes[j] = arr[i];
                j++;
            }
        }
        return arrRes;
    }
}
