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
		System.out.println("Mảng a Có các phần tử sau: ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		inSoDauTienLe(a);
	}
	
	public static int nhapN() {
		int n;
		System.out.println("Vui lòng nhập N");
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 0) {
				System.out.println("Vui lòng nhập N >0");
			}
		} while (n <= 0);
		
		return n;
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random()*(MAX-MIN+1));
		}
		return a;
	}
	
	//Cách 2
	public static boolean kiemTraSoDauTien(int x) {
		boolean flag = false;
		x = Math.abs(x);
		while (x>=10) {
			x /=10;
		}
		if(x%2 != 0) {
			flag = true;
		}
		return flag;
	}
	public static void inSoDauTienLe (int a[]) {
		System.out.println("\n Các số Đàu tiên lẻ là: ");
		for (int i = 0; i < a.length; i++) {
			if (kiemTraSoDauTien(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}
}
