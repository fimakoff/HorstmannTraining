package ch01;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input degrees: ");
        int degrees = sc.nextInt();
        int aroundDegrees = (degrees < 0) ? 360 + degrees % 360:degrees % 360;
        System.out.println("Сomputed using the ternary operator: " + aroundDegrees);
        System.out.println("Сomputed using the \"Math.floorMod\": " + Math.floorMod(degrees, 360));
    }

}
