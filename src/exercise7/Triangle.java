package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }
        for (int j = n-1 ; j >0 ; j--) {
            printLine(1,j);
        }

        // Print the bottom part of the triangle that is under the longest line
    }

    public static void printLine(int start, int end) {
        // Implement method
        for (int i = start  ; i <= end; i++) {
            System.out.print(i);
            if(i!=end){
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
