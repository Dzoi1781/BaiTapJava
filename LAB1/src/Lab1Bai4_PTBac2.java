import java.util.Scanner;

public class Lab1Bai4_PTBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập a: ");
		double a = scanner.nextDouble();
		
		System.out.printf("Nhập b: ");
		double b = scanner.nextDouble();
		
		System.out.printf("Nhập c: ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b,2) - 4 * a * c;
		
		if (delta < 0) {
			System.out.printf("Phương trình vô nghiệm");
		}
		else {
			System.out.printf("Căn delta là: %.2f", + Math.sqrt(delta));
		}
	}
}