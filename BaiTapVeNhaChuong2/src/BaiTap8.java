import java.util.Scanner;

public class BaiTap8 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;

	public BaiTap8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int dong = nhapDongTinhTong(soDong);
		int sum =tinhTongDong(a, dong, soCot);
		System.out.println("Tổng các số ở dòng " + dong + " là " +sum);
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

	// Hàm nhập dòng tính tống
	public static int nhapDongTinhTong(int soDong) {
		System.out.println("Vui lòng nhập vào dòng bạn muốn tính tổng");
		int dong;
		do {
			dong = Integer.parseInt(scan.nextLine());
			if (dong < 0) {
				System.out.println("Vui lòng nhập lại số cột lớn hơn 0");
			} else if (dong > soDong) {
				System.out.println("Vui lòng nhập lại số cột nhỏ hơn " + soDong);
			}
		} while (dong < 0 || dong > soDong);
		return dong;
	}

	// Hàm tính tổng tại dòng người dùng nhập
	public static int tinhTongDong(int a[][], int dong, int soCot) {
		int sum = 0;
		for (int i = 0; i < soCot; i++) {
			sum += a[dong][i];
		}
		return sum;
	}
}
