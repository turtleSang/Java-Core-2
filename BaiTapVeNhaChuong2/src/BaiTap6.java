import java.util.Scanner;

public class BaiTap6 {
	static Scanner scan = new Scanner(System.in);

	public BaiTap6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = nhapMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		boolean check = kiemTraMang(a, soDong, soCot);
		if (check) {
			System.out.println("Mảng Toàn Dương");
		}else {
			System.out.println("Mảng có số âm");
		}

	}

	// Hàm Nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	// Hàm nhập mảng
	public static int[][] nhapMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "][" + j + "] =");
				a[i][j] = Integer.parseInt(scan.nextLine());				
			}			
		}
		return a;
	}

	// Hàm Xuất Mảng
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Kiểm tra mảng có toàn dương không
	public static boolean kiemTraMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j]<0) {
					return false;
				}
			}
		}
		return true;
	}
}
