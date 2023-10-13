
import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số lượng phần tử của mảng");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatMang2(a);
		int tongSoChan = tongSoChan(a);
		int tongSoLe = tongSoLe(a);
		System.out.println("\n");
		System.out.println("Tổng các số lẻ trong mảng là: " + tongSoLe);
		System.out.println("Tổng các số chẵn trong mảng là: " + tongSoChan);
		int countSoAm = demSoAm(a);
		int tongSoAm = tongSoAm(a);
		System.out.println("Trong Dãy có: " + countSoAm + " số âm");
		System.out.println("Tổng các số âm trong mảng la: " + tongSoAm);

	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());

		}
		return a;
	}

	// Xuất mảng sủ dụng for
	public static void xuatMang(int a[]) {
		System.out.println("Xuất Mảng For ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	// Xuất mảng sử dụng for êch
	public static void xuatMang2(int a[]) {
		System.out.println("\nXuất mảng For ech");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}

	// Tính tổng các số chẵn sử dụng for each
	public static int tongSoChan(int a[]) {
		int tong = 0;
		for (int pt : a) {
			if (pt % 2 == 0) {
				tong += pt;
			}
		}
		return tong;

	}

	// Tính tổng các số lẻ sử dụng for
	public static int tongSoLe(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				tong += a[i];
			}
		}
		return tong;
	}

	// Đếm có bao nhiêu số âm
	public static int demSoAm(int a[]) {
		int count = 0;
		for (int pt : a) {
			if (pt < 0) {
				count++;
			}
		}

		return count;
	}

	// Tổng các số âm
	public static int tongSoAm(int a[]) {
		int tong = 0;
		for (int pt : a) {
			if (pt < 0) {
				tong += pt;
			}
		}

		return tong;
	}

}
