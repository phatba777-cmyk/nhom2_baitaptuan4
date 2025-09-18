package bttuan4;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Nhập số nguyên thứ nhất: ");
        a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        b = scanner.nextInt();

        int ucln = findUCLN(a, b);
        int bcnn = (a * b) / ucln;

        System.out.println("Ước chung lớn nhất (UCLN) của " + a + " và " + b + " là: " + ucln);
        System.out.println("Bội chung nhỏ nhất (BCNN) của " + a + " và " + b + " là: " + bcnn);

        scanner.close();
    }
    public static int findUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
