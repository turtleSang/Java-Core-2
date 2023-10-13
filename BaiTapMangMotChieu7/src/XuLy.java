import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 100;
	static final int MIN = -100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapN();
		int a[] = taoMang(n);
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int b[] = taoMangTam(a);
		a = b;
		System.out.println("Mảng a Mới hình thành là");
		for (int i : a) {
			System.out.print(i + "\t");
		}

	}

	// Hàm tạo random
	public static int random() {
		int x = MIN + (int) (Math.random() * (MAX - MIN + 1));
		return x;
	}

	// Hàm nhập N
	public static int nhapN() {
		int n;
		System.out.println("Vui lòng nhập vào N");
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n <= 0) {
				System.out.println("Vui Lòng nhập N > 0");
			}
		} while (n <= 0);
		return n;
	}

	// hàm tạo mảng ngẫu nhiên
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random();
		}
		return a;
	}

	// Hàm nhập vị trí thêm vào k
	public static int nhapK(int a[]) {
		int k;
		System.out.println("Nhập vào vị trí muốn thêm vào mảng A");
		do {
			k = Integer.parseInt(scan.nextLine());
			if (k >= a.length) {
				System.out.println("Vui lòng nhập k < " + a.length);
			}

		} while (k >= a.length);
		return k;
	}

	// Hàm nhập vào giá trị X thay thế tạo k
	public static int nhapX(int k) {
		System.out.println("Vui lòng nhập vào giá trị X thay thế tại vị trí thứ " + k);
		int x = Integer.parseInt(scan.nextLine());
		return x;
	}

	// Hàm tạo ra mảng tạm
	public static int[] taoMangTam(int a[]) {
		int k = nhapK(a);
		int x = nhapX(k);
		int b[] = new int[a.length + 1];
		for (int i = 0; i < b.length; i++) {
			if (i == k) {
				b[i] = x;
			} else if (i < k) {
				b[i] = a[i];
			} else {
				b[i] = a[i - 1];
			}
		}
		return b;
	}

}
