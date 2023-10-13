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
		xuatMang(a);
		
		int b[] = thaySoLe(a);
		for (int i : b) {
			System.out.print(i + "\t");
		}
	}

	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static int dem(int a[]) {
		int count = 0;
		for (int i : a) {
			if ((i % 4) == 0 && timChuSoCuoiCung(i) == 6) {
				count++;
			}
		}
		return count;
	}

	public static int timChuSoCuoiCung(int x) {
		x = Math.abs(x);
		while (x >= 10) {
			x %= 10;
		}
		return x;
	}

	public static int[] thaySoLe(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			if (a[i] % 2 == 0) {
				b[i] = a[i];
			} else {
				b[i] = 2 * a[i];
			}
		}
		a = b;
		return a;
	}

	public static int random() {
		int x = MIN + (int) (Math.random() * (MAX - MIN + 1));
		return x;
	}

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

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random();
		}
		return a;
	}
}
