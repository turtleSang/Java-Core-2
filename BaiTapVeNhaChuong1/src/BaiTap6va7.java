import java.util.Scanner;

public class BaiTap6va7 {
	static final int MIN = -1000;
	static final int MAX = 1000;
	static Scanner scan = new Scanner(System.in);

	public BaiTap6va7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		int tongSoDuong = tinhTongCacSoDuong(a);
		System.out.println("Tổng các số dương trong mảng = "+ tongSoDuong);
		int tongSo5Chuc = tinhTongCacSoCoChuSoHangChucLa5(a);
		System.out.println("Tổng các số có hàng chục là 5 = " + tongSo5Chuc );
	}

	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);

		return n;
	}

	public static void xuatMang(int a[]) {
		System.out.println("Mảng ngẫu nhiên có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}
	public static int tinhTongCacSoDuong(int a[]) {
		int tongSoDuong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) {
				tongSoDuong += a[i];
			}
		}
		return tongSoDuong;
	}
	//Bài 7 tính tổng các số có chữ số dầu bằng 5
	public static int timSoHangChuc(int b) {
		b = Math.abs(b);
		while (b>=100) {
			b%=100;
		}
		b /=10;
		return b;
	}
	public static int tinhTongCacSoCoChuSoHangChucLa5(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (timSoHangChuc(a[i]) == 5) {
				sum += a[i];
			}
		}
		return sum;
	}
}
