package ch01;

public class Ex5 {
    public static void main(String[] args) {
        int num = 2147483647;
        double doubleNum = num+1;
        int intNum = (int)doubleNum;
        System.out.println(intNum);
    }
}
