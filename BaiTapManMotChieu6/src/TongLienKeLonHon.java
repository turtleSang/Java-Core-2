import java.util.Scanner;

public class TongLienKeLonHon {
	static final int MAX = 1000;
	static final int MIN = -1000;
	static Scanner scan = new Scanner(System.in);
	public TongLienKeLonHon() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int n = nhapN();
		int a[]= taoMang(n);
		xuatMang(a);
		int tong = tong(a);
		System.out.println("Tổng các số có số liền kề trước nhỏ hơn là: "+tong);
	}
	
	//Nhập N và tạo mảng và xuất mảng
	public static int nhapN() {
		int n;
		System.out.println("Vui lòng nhập N");
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 0) {
				System.out.println("Vui lòng nhập N >0");
			}
		} while (n <= 0);
		
		return n;
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random()*(MAX-MIN+1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Tính tổng số liền kề trước mảng
	public static int tong(int a[]) {
		int tong = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i-1]) {
				tong += a[i];
			}
		}
		return tong;
	}
}