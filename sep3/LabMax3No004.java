package sep3;

import java.util.Scanner;

public class LabMax3No004 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a,b,c \nI will give you the maximum of three");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Your inputs are " + a + " " + b + " " + c );

        if (a>b && a>c) {
            System.out.println("Max is " + a);
        }

        if (b>a && b>c) {
            System.out.println("Max is " + b);
        }

        if (c>a && c>b) {
            System.out.println("Max is " + c);
        }

    }
}
