/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;
import java.util.Scanner;
/**
 *
 * @author Lê Hoàng Hải
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " khong phai la so nguyen to ");
        } else {
            boolean laNguyenTo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break;
                }
            }
            if (laNguyenTo) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }

    }
}

