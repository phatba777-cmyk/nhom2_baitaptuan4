package bttuan4;
import java.util.Scanner;
public class bt3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2, result;
	        int choice;

	        System.out.println("=== Máy Tính Cơ Bản ===");
	        System.out.print("Nhập số thứ nhất: ");
	        num1 = scanner.nextDouble();

	        System.out.print("Nhập số thứ hai: ");
	        num2 = scanner.nextDouble();

	        System.out.println("\nChọn phép tính:");
	        System.out.println("1. Cộng (+)");
	        System.out.println("2. Trừ (-)");
	        System.out.println("3. Nhân (*)");
	        System.out.println("4. Chia (/)");
	        System.out.print("Lựa chọn của bạn (1-4): ");
	        choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Kết quả: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Kết quả: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Kết quả: " + result);
	                break;
	            case 4:
	                if (num2 == 0) {
	                    System.out.println("Lỗi: Không thể chia cho 0!");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("Kết quả: " + result);
	                }
	                break;
	            default:
	                System.out.println("Lựa chọn không hợp lệ!");
	        }

	        scanner.close();
	    }
	}



