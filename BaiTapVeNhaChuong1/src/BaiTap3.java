import java.util.Scanner;

public class BaiTap3 {
	static final int MIN = -100;
	static final int MAX = 100;
	static Scanner scan = new Scanner(System.in);

	public BaiTap3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		inGiaTriThoaDieuKien(a);
	}

	// Hàm nhập Chiều dài N của mảng
	public static int nhapChieuDaiMang() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài mảng lớn hơn 0 và là số chẵn");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0 || n % 2 != 0);
		return n;
	}

	public static int[] taoMang() {
		int a[] = new int[nhapChieuDaiMang()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}

		return a;
	}

	// Xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng vừa nhập có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Hàm nhập số x
	public static int nhapBefore() {
		System.out.println("Vui lòng nhập số chặn Dưới");
		int x = Integer.parseInt(scan.nextLine());
		return x;
	}

	// hàm nhập số y
	public static int nhapAfter(int x) {
		System.out.println("Vui lòng nhập số chặn Trên");
		int y;
		do {
			y = Integer.parseInt(scan.nextLine());
			if (y < x) {
				System.out.println("Vui lòng nhập số chặn trên > " + x);
			}
		} while (y < x);
		return y;
	}

	// Hàm đếm xem có bao nhiêu số chẵn trong đoạn x-y
	public static int demSoChan(int a[], int x, int y) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] >= x && a[i] <= y) {
				count++;
			}
		}
		return count;
	}

	// Hàm Xuất ra có bao nhiêu giá trị trong đoạn X-Y
	public static void inGiaTriThoaDieuKien(int a[]) {
		int x = nhapBefore();
		int y = nhapAfter(x);
		int count = demSoChan(a, x, y);
		if (count == 0) {
			System.out.println("Không có giá trị chẵn nào trong Mảng thuộc đoạn " + x + " đến " + y);
		} else {
			System.out.println("Các số chẵn nằm trong đoạn " + x + " đến " + y);
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0 && a[i] >= x && a[i] <= y) {
					System.out.print(a[i] + "\t");
				}
			}
		}
	}

}
