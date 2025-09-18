import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("So nho nhat la: " + min);
        scanner.close();
    }
}

