import java.util.Scanner;

public class NangCao3 {
	static Scanner scan = new Scanner(System.in);

	public NangCao3() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("Nhập vào số N");
		int n = nhapN();
		int a[] = nhapMang(n);
		xuatmang(a);
		boolean check = kiemTraDoiXung(a);
		if (check) {
			System.out.println("Mảng đối Xứng");
		} else {
			System.out.println("Mảng không đối xứng");
		}
		System.out.println("Vui lòng nhập vào số lần đổi");
		int k = nhapN();
		System.out.println("Sự hoán đổi");
		int b[] = moveTimes(a, k);
		System.out.println("Mảng Sau khi hoán đổi là");
		xuatmang(b);
	}
	// Nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
		return n;
	}

	// Nhập Mảng
	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print(" a[" + i + " ] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	// Xuất mảng
	public static void xuatmang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Kiểm tra mảng đối xưng
	public static boolean kiemTraDoiXung(int a[]) {
		for (int i = 0; i < (a.length/2); i++) {
			if (a[i]!=a[a.length-i -1]) {
				return false;
			}
		}
		return true;
	}
	//Đảo mảng
	public static int[] moveArray(int a[]) {
		int move = a[0];
		for (int i = 0; i < a.length; i++) {
			if (i < (a.length -1) ) {
				a[i] = a[i+1];
			}else {
				a[i] = move;
			}
		}
		
		return a;
	}
	//Đảo mảng k lần
	public static int[] moveTimes(int a[], int k) {
		k %= a.length;
		for (int i = 0; i < k; i++) {
			a = moveArray(a);
			xuatmang(a);
		}
		return a;
	}
}
