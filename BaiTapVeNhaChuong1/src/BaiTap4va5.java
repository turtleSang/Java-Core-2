import java.util.Scanner;

public class BaiTap4va5 {
	static final int MIN = -1000;
	static final int MAX = 1000;
	static Scanner scan = new Scanner(System.in);

	public BaiTap4va5() {

	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		inSoLe(a);
		inPTCoSoDauTienChan(a);
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
	//in ra các số lẻ trong mảng
	public static void inSoLe(int a[]) {
		int demSoLe = 0;
		// Đếm các số lẻ trong mảng
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				demSoLe++;
			}
		}
		// Nếu đếm số lẻ bằng 0 xuất ra không có số lẻ và in ra nếu khác 0
		if (demSoLe == 0) {
			System.out.println("Trong mảng không có số lẻ");
		} else {
			System.out.println("Các số lẻ trong mảng là");
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					System.out.print(a[i] + "\t");
				}
			}
		}
		System.out.println();
	}
	//Hàm tìm chữ số đầu tiên của 1 số
	public static int timChuSoDauTien(int b) {
		b = Math.abs(b);
		do {
			b/=10;
		} while (b>=10);
		return b;
	}
	public static void inPTCoSoDauTienChan(int a[]) {
		System.out.println("Các số có chữ số đầu tiên chẵn là: ");
		for (int i = 0; i < a.length; i++) {
			if (timChuSoDauTien(a[i]) % 2 == 0 ) {
				System.out.print(a[i]+"\t");
			}
		}
	}
}
