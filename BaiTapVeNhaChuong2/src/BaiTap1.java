import java.util.Scanner;

public class BaiTap1 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;
	public BaiTap1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		timSoChanDauTien(a, soDong, soCot);
		
	}
	//Hàm nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}
	//Hàm tạo Mảng
	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int)(Math.random()*(MAX-MIN+1));
			}
		}
		return a;
	}
	//Hàm Xuất Mảng
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Hàm Tìm số chẵn đầu tiên
	public static void timSoChanDauTien(int a[][], int soDong, int soCot) {
		System.out.println("Tìm số chẵn đầu tiền");
		int i = 0; 
		int j = 0;
		boolean flag = false;
		for ( i = 0; i < soDong; i++) {
			for (j = 0;  j< soCot; j++) {
				if (a[i][j] % 2 ==0) { 
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Số chẵn đầu tiên là "+ a[i][j]);
			System.out.println("Vị trí số chẵn đầu tiên là: a[" + i +"][" + j+"]" );
		} else {
			System.out.println("Mảng Không có số chẵn");
		}
	}
	
}
