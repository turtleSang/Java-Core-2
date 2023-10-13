import java.util.Scanner;

public class XuLy {

	static Scanner scan = new Scanner(System.in);
	static final int MAX = 100;
	static final int MIN = -100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Hàm Nhập Random
	public static int random() {
		int x = MIN + (int) (Math.random() * (MAX - MIN + 1));
		return x;
	}

	// Hàm xuất mảng
	public static void xuatMang(int a[]) {

		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Hàm nhập N
	public static int nhapN() {
		int n;
		System.out.println("Vui lòng nhập vào N");
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n <= 2 || n % 2 != 0) {
				System.out.println("Vui Lòng nhập N > 0 và N chẵn");
			}
		} while (n <= 2 || n % 2 != 0);
		return n;
	}

	// Hàm Random
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random();
		}
		return a;
	}
	
	public static void timRun(int a[]) {
		int head = 0;
		int len =0;
		int maxHead = 0;
		int maxLen = 0;
		for (int i = head; i < a.length; i++) {
			if (a[i] > a[i+1]) {
				len = i - head;
				head = i;
			}
		}
	}
}
