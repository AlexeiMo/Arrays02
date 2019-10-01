package by.epam.array_tasks;
//16. Даны действительные числа
//a a an
//, , , 1 2 
//. Найти
//max( , , , ) a1 + a2n a2 + a2n−1  an + an+1
//.

public class Arr16 {
    public static int task(int[] arr) {
        int max = 0;
        for (int i = 0, j =arr.length-1; i < j; i++, j--) {
            if ((arr[i]+arr[j]) > max) {
                max = arr[i]+arr[j];
            }
        }
        return max;
    }
}
