import java.util.Scanner;
public class Lab1Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hoten = "";
		double Diemtb = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Họ và tên: ");
		Hoten = scanner.nextLine();
		
		System.out.printf("Điểm TB: "); 
		Diemtb = scanner.nextDouble();
		
		System.out.printf("Sinh viên: %s", Hoten);
		System.out.printf("\nĐiểm trung bình là: %.1f", Diemtb);
	}

}