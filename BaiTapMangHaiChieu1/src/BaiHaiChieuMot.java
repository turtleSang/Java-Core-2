import java.util.Scanner;

public class BaiHaiChieuMot {
	static Scanner scan = new Scanner(System.in);
	public BaiHaiChieuMot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		System.out.println("Vui lòng nhập số Dòng");
		int soDong = nhapN();		
		int a[][] = nhapMang2Chieu(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int sum = tinhTong(a, soDong, soCot);
		System.out.println("Tổng các số trong mảng là: " +sum);
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số lớn hơn >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n<2);
		return n;
	}
	public static int[][] nhapMang2Chieu(int soDong, int soCot) {
		int a[][] = new int[soCot][soDong];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a["+ i+ "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}
	public static int tinhTong(int a[][], int soDong, int soCot){
		int sum = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
}
