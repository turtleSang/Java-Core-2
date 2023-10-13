
import java.util.Scanner;

public class BaiTap3 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;
	public BaiTap3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		timSoDuongDauTien(a, soDong, soCot);

	}

	// Hàm nhập N
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
	public static void timSoDuongDauTien(int a[][], int soDong, int soCot) {
		boolean flag = false; //Check xem mảng có số dương không
		int i = 0; //Tạo biến i ngoài vòng lặp để tái sử dụng
		int j = 0; //Tạo biến i ngoài vòng lặp để tái sử dụng
		for (i = 0; i < soDong; i++) {
			for (j = 0; j < soCot; j++) {
				if (a[i][j] > 0) {
					flag = true;//Nếu có số dương bật cờ hiệu thành true
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Số Dương đầu tiên tron mảng là "+ a[i][j]);
			System.out.println("Vị Trí số dương đầu tiên là: [" + i + "][" + j + "]");
		}else {
			System.out.println("mảng không có số Dương");
		}
	}

}
