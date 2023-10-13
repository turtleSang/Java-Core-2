import java.util.Scanner;

public class BaiTap4 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;
	public BaiTap4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số Dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số Cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		System.out.println("Mảng A bao Gồm");
		xuatMang(a, soDong, soCot);
		int b[][] = taoMang(soDong, soCot);
		System.out.println("Mảng B bao gồm");
		xuatMang(b, soDong, soCot);
		int c[][] = tinhTongHaiMang(a, b, soDong, soCot);
		System.out.println("Tổng 2 mảng A và B là:");
		xuatMang(c, soDong, soCot);
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số lớn hơn >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n<2);
		return n;	
	}
	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random()*((MAX-MIN) + 1));
			}
		}
		return a;
	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static int[][] tinhTongHaiMang(int a[][], int b [][], int soDong, int soCot){
		int c[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

}
