package by.epam.array_tasks;
//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
//последовательности. Если таких чисел нет, то вывести сообщение об этом факте

public class Arr5 {
    public static int[] task(int[] arr) {
        int j = 0;
        for (int elem:arr) {
            if(elem%2 == 0) {
                j++;
            }
        }
        if(j == 0) {
            System.out.println("This sequence doesn't have even");
        }
        int[] arrRes = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) {
                arrRes[j] = arr[i];
                j++;
            }
        }
        return arrRes;
    }
}
