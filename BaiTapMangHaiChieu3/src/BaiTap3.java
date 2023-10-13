import java.util.Scanner;

public class BaiTap3 {
	static Scanner scan = new Scanner(System.in);
	public BaiTap3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số Dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số Cột");
		int soCot = nhapN();
		int a[][] = nhapMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		System.out.println();
		System.out.println("Dòng có giá trị giảm dần là: ");
		xuatDongCoGiaTriGiamDan(a, soDong, soCot);

	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số lớn hơn >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n<2);
		return n;
	}
	public static int[][] nhapMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" +i+ " ][ "+j + "] = ");
				a[i][j]= Integer.parseInt(scan.nextLine());
				
			}
		}
		return a;		
	}
	public static void xuatMang(int a[][],int soDong,int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void xuatDongCoGiaTriGiamDan (int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			boolean flag = true;
			for (int j = 0; j < soCot-1; j++) {
				if (a[i][j] < a[i][j+1]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("Dòng " + i + " Có giá trị giảm dần");
			}
		}
	}

}
