import java.util.Scanner; 

public class Lab1Bai3_KhoiLapPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float canh;
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Nhập cạnh: ");
		canh = scanner.nextFloat();
		
		float Thetich = canh * canh * canh;
		Thetich = (float) Math.pow(canh,3);
		
		System.out.printf("Thể tích khối lập phương: %.1f", Thetich);
	}

}