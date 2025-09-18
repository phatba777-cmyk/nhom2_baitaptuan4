import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            tong += arr[i];
        }

        System.out.println("Tong cac phan tu trong mang la: " + tong);
        sc.close();
    }
}

