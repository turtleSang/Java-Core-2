import java.util.Scanner;

public class BaiTap10 {
	static final int MAX = 1000;
	static final int MIN = -1000;
	static Scanner scan = new Scanner(System.in);
	public BaiTap10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		tinhTrungBinhCong(a);

	}
	// Hàm nhập chiều dài mảng
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài mảng > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n<=0);
		return n;
	}
	//Hàm tạo mảng
	public static int [] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random()*((MAX-MIN)+1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		System.out.println("Các phần tử trong mảng a là: ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void tinhTrungBinhCong(int a[]) {
		System.out.println("Vui lòng nhập số X");
		int x = Integer.parseInt(scan.nextLine());
		int demSoLonHon = 0;
		int tongSoLonHon = 0;
		System.out.println("Các số lớn hơn X là: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				demSoLonHon++;
				tongSoLonHon += a[i];
				System.out.print(a[i] + "\t");
			}
		}
		System.out.println();
		if (demSoLonHon == 0) {
			System.out.println("Trong mảng không có số nào lớn hơn " + x );
		} else {
			float trungBinhCongSoLonHon = tongSoLonHon*1.0f/demSoLonHon; 
			System.out.println("Trung bình cộng của các số lơn hơn " +x+ " là: "+ trungBinhCongSoLonHon);
		}
	}
	
	

}
