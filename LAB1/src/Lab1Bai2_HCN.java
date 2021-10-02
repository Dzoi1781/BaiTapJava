import java.util.Scanner;

public class Lab1Bai2_HCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dai, rong;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài HCN: ");
		dai = scanner.nextFloat();
		
		System.out.print("Nhập chiều rộng HCN: ");
		rong = scanner.nextFloat();
		
		float Chuvi = (dai + rong) * 2;
		float Dientich = dai * rong;
		float min = Math.min(dai, rong);
		
		System.out.println();
		System.out.printf("Chu vi HCN là: %.1f", Chuvi);
		System.out.printf("\nDiện tích HCN là: %.1f", Dientich);
		System.out.printf("\nCạnh nhỏ nhất của HCN là: %.1f", min);
	}
}