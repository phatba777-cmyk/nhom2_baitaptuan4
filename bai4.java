
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10;
import java.util.Scanner;
/**
 *
 * @author Lê Hoàng Hải
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = scanner.nextInt();



        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

       

        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
    }
}


