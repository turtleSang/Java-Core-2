import java.util.Scanner;

public class BaiTap2 {
	static Scanner scan = new Scanner(System.in);
	public BaiTap2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		int c =khoangCachNhoNhat(a);
		System.out.println("Khoảng cách nhỏ nhất trong mảng là: "+c);
		inCacCapCoKhoangCachNhoNhat(a);

	}

	// Xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng vừa nhập có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Tìm khoảng cách nhỏ nhất trong mảng phần tử a để biết được khoảng cách nhỏ nhất
	public static int khoangCachNhoNhat(int a[]) {
		int khoangCachNhoNhat = Math.abs(a[0]-a[1]);
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int khoangCach = Math.abs(a[i]-a[j]);
				if (khoangCach < khoangCachNhoNhat) {
					khoangCachNhoNhat = khoangCach;
				}
			}
		}
		return khoangCachNhoNhat;
	}
	// In các cặp có khoảng cách thỏa điều kiện là khoản cách nhỏ nhất
	public static void inCacCapCoKhoangCachNhoNhat(int a[]) {
		int khoangCachNhoNhat = khoangCachNhoNhat(a);
		System.out.println("Các cặp có khoảng cách nhỏ nhất là");
		for (int i = 0; i < a.length -1 ; i++) {
			for (int j = i+1; j < a.length; j++) {
				int khoangCach = Math.abs(a[i]-a[j]);
				if (khoangCach == khoangCachNhoNhat) {
					System.out.print(a[i]+"__"+a[j] + "\t");
				}
			}
		}
	}
	
	public static int nhapChieuDaiMang() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài mảng >= 2");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
		return n;
	}
	public static int[] nhapMang() {
		int n = nhapChieuDaiMang();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i +"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	
	

}
