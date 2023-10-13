import java.util.Scanner;

public class XuLy {
	static final int MIN = -100;
	static final int MAX = 100;
	static Scanner scan = new Scanner(System.in);

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapN();
		int a[] = taoMang(n);
		xuatMang(a);
		xuatGiaTri(a);

	}

	// hàm random số từ -100 dến 100
	public static int random() {
		int pt = MIN + (int) (Math.random() * (MAX - MIN + 1));
		return pt;
	}

	// Hàm Nhập N
	public static int nhapN() {
		System.out.println("Nhập vào số N");
		int n;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 0 || n % 2 != 0) {
				System.out.println("Vui Lòng nhập lại N với N > 0 và N chẵn");
			}
		} while (n < 0 || n % 2 != 0);

		return n;
	}

	// Hàm tạo mảng random
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random();
		}
		return a;
	}

	// Hàm xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng dược lại ra là");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}

	// Hàm tìm giá trị
	public static void xuatGiaTri(int a[]) {
		System.out.print("\nNhập giá trị x dưới");
		int soDau = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập giá trị y trên");
		int soCuoi = Integer.parseInt(scan.nextLine());
		System.out.println("\n Các số nằm trong khoảng " + soDau + " và " +  soCuoi + " của mảng a là");
		
		for (int item : a) {
			if ( (item >= soDau) && item <= soCuoi ) {
				System.out.print(item + "\t");
			}
		}
		
	}

}
