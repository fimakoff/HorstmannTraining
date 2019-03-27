package ch01;

import java.util.Scanner;

public class Ex1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a number:");
        int num = sc.nextInt();
        System.out.println(num + " в двоичной системе счисления: " + Integer.toString(num, 2));
        System.out.printf(num + " в шестнадцатеричной системе счисления: %x", num);
        System.out.println();
        String str = Integer.toString(num,16);
        System.out.print(num + " виде обратного значения в шестнадцатеричной форме: ");
        char[] temp=new char[str.length()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = str.charAt(temp.length-i-1);
            System.out.print(temp[i]);
        }

    }
}
