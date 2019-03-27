package ch01;

import java.util.Scanner;

public class Ex3 {
    public static final int MAX_NUMBER = 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[MAX_NUMBER];
        do {
            System.out.print("Input number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < MAX_NUMBER);
        System.out.print("Max number is (if else): ");
        int temp = 0;
        for (int j = 0; j < MAX_NUMBER; j++) if (temp < arr[j]) temp = arr[j];
        System.out.print(temp);
        System.out.print("\nMax number is (Math.max()): ");

        int tempMath = 0;
        for (int j = 0; j < MAX_NUMBER; j++) {
            tempMath = Math.max(tempMath, arr[j]);
        }
        System.out.println(tempMath);
    }
}
