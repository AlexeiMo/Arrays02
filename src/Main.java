import by.epam.array_tasks.*;
import by.epam.matrix_tasks.*;

public class Main {
    public static void main(String[] args) {
        //int arrI[] = {0,1,2,3,4,5,6,7,8,9};
        //double arrD[] = {1.5,9.8,7.2,-9.6,-10,8.6,0,0,0};
        int[][] mx = new int[5][];
        for (int i = 0; i < mx.length; i++) {
            mx[i] = new int[5];
            for (int j = 0; j < mx[i].length; j++) {
                mx[i][j] = -9 + (int)(Math.random()*19);
            }
        }
        mx = Mx19.task(8);
        for (int[]elem:mx) {
            for (int elem2:elem) {
                System.out.print(elem2 + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}