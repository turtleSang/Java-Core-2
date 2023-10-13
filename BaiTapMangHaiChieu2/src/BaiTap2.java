import java.util.Iterator;
import java.util.Scanner;

public class BaiTap2 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;
	public BaiTap2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	System.out.println("Vui lòng nhập số Dòng");
	int soDong = nhapN();
	System.out.println("Vui lòng nhập số cột");
	int soCot = nhapN();
	int a[][] = taoMang(soDong, soCot);
	xuatMang(a, soDong, soCot);
	inCacGiaTriMax(a, soDong, soCot);
	System.out.println();
	inCacDongCoSoChan(a, soDong, soCot);

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
	public static void inCacGiaTriMax(int a[][], int soDong, int soCot) {
		//Tìm max thật sự ở trong mảng trước 
		int maxValue = a[0][0];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
				}
			}
		}
		System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
		System.out.println("Vị Trí các phần tử lớn nhất là");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] == maxValue) {
					System.out.print("[" + i +"][" + j + "]" + "\t");
				}
			}
		}		
	}
	
	public static void inCacDongCoSoChan(int a[][], int soDong, int soCot) {
		System.out.println("Các dòng chứa giá trị chẵn là: ");
		for (int i = 0; i < soDong; i++) {
			boolean flag = false;
			for (int j = 0; j < soCot; j++) {
				if (a[i][j]%2 == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.print(i + "\t");
			}
			
		}
	}
}
