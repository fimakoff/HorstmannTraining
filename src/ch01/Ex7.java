package ch01;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers (0 to 65535): ");
        short num1 = sc.nextShort();
        short num2 = sc.nextShort();
        short sum = (short) (num1 + num2);
        System.out.println(sum);
        short diff = (short) (num1 - num2);
        System.out.println(diff);
        short multyply = (short) (num1 * num2);
        System.out.println(multyply);
        short division = (short) (num1 / num2);
        System.out.println(division);
        short rem = (short) (num1 % num2);
        System.out.println(rem);
    }
}
