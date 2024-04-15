package ass2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][];
        array[0] = new int[]{1, 2, 3, 4};
        array[1] = new int[]{1, 2};
        array[2] = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + array[i].length + " elements for row " + i + ":");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Data stored in the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
