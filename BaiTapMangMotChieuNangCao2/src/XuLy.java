import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = {1,1,3,2,2};
		xuatmang(a);
		xuatPhanTuGiong(a);

	}
	//Nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập N > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n<=0);
		return n;
	}
	//Nhập Mảng
	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print(" a[" + i +" ] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	//Xuất mảng
	public static void xuatmang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Đếm
	public static int[] demPhanTuTrongMangA(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	public static void xuatPhanTuGiong (int a[]) {
		int b[] = demPhanTuTrongMangA(a);
		for (int i = 0; i < b.length; i++) {
			if (b[i]!=0) {
				System.out.println("Có " + b[i] + " phần tử số " + a[i] + " xuất hiện trong mảng");
			}
		}
	}
}
