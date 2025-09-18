package bttuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Bạn muốn nhập bao nhiêu số nguyên? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("\nCác phần tử trong danh sách là:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
