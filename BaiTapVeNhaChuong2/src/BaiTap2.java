import java.util.Scanner;

public class BaiTap2 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;

	public BaiTap2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int sum = tinhTongSoChanCuaMang(a, soDong, soCot);
		System.out.println("Tổng số chẵn trong mảng là: " + sum);

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
	// Hàm tính tổng số chẵn của mảng
	public static int tinhTongSoChanCuaMang(int a[][], int soDong, int soCot) {
		int sum = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j]%2 == 0) {
					sum += a[i][j];
				}
			}
		}
		return sum;
	}
}
