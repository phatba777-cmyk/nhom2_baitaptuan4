import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("So duong");
        } else if (n < 0) {
            System.out.println("So am");
        } else {
            System.out.println("So bang 0");
        }
        sc.close();
    }
}

