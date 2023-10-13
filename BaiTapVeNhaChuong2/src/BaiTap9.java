import java.util.Scanner;

public class BaiTap9 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;
	public BaiTap9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int cot = nhapCotTinhTong(soCot);
		int sum = tinhTongSoLeCot(a, soDong, cot);
		System.out.println("Tổng các số lẻ trên cột " + cot + " là " + sum);
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

	// Hàm tạo Mảng
	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * (MAX - MIN + 1));
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
	//Hàm nhập cột tính tổng
	public static int nhapCotTinhTong(int soCot) {
		System.out.println("Vui lòng nhập cột màn bạn muốn tính tổng");
		int cot;
		do {
			cot = Integer.parseInt(scan.nextLine());
			if (cot < 0) {
				System.out.println("Vui lòng nhập lại số cột lớn hơn 0");
			}else if (cot > soCot) {
				System.out.println("Vui lòng nhập lại số cột nhỏ hơn " + soCot );
			}
		} while (cot < 0 || cot > soCot);
		return cot;
	}
	public static int tinhTongSoLeCot(int a[][], int soDong, int cot) {
		int sum = 0;
		for (int i = 0; i < soDong; i++) {
			if (a[i][cot] % 2 !=0) {
				sum +=a[i][cot];
			}
		}		
		return sum;
	}

}
