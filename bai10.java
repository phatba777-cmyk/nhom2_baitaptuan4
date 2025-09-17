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
public class bai10 {
     public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = Scanner.nextInt();
        int[] arr = new int[100]; // kich thuoc co dinh
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Scanner.nextInt();
        }
        System.out.print("Mang ban dau: ");
        inMang(arr, n);
        System.out.print("Nhap gia tri muon them: ");
        int giaTriThem = Scanner.nextInt();
        System.out.print("Nhap vi tri muon them (0 -> " + n + "): ");
        int viTriThem = Scanner.nextInt();
        if (viTriThem >= 0 && viTriThem <= n) {
            for (int i = n; i > viTriThem; i--) {
                arr[i] = arr[i - 1]; 
            }
            arr[viTriThem] = giaTriThem;
            n++;
        } else {
            System.out.println("Vi tri them khong hop le!");
        }

        System.out.print("Mang sau khi them: ");
        inMang(arr, n);
        System.out.print("Nhap vi tri muon xoa (0 -> " + (n - 1) + "): ");
        int viTriXoa = Scanner.nextInt();

        if (viTriXoa >= 0 && viTriXoa < n) {
            for (int i = viTriXoa; i < n - 1; i++) {
                arr[i] = arr[i + 1]; 
            }
            n--;
        } else {
            System.out.println("Vi tri xoa khong hop le!");
        }

        System.out.print("Mang sau khi xoa: ");
        inMang(arr, n);
    }
    public static void inMang(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
         System.out.println();
    }
}
