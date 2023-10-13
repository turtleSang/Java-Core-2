
import java.util.Scanner;

public class Bai4 {
	static final int MAX = 100;
	static final int MIN = -100;
	static Scanner scan = new Scanner(System.in);
	
	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapN();
		int a[] =  taoMang(n);
		xuatMang(a);
		inKetqua(a);
	
	

	}

	//Hàm nhập N
	public static int nhapN() {
		System.out.println("Vui lòng nhập số N > 0");
		int n;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n<=0) {
				System.out.println("Vui Lòng nhập lại N >0");
			}
		} while (n<=0);
		return n;
	}
	// Hàm xuất mảng
	public static void xuatMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	//Tạo mảng random
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random()*(MAX-MIN+1));
		}
		return a;
	}

	// Tìm vị trí số dương đầu tiên
	public static int timViTriDuongDau(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				break;
			}
		}

		return index;
	}

	// Hàm tìm vị trí số dương nhỏ nhất
	public static int timViTriDuongNhoNhat(int a[], int index) {
		int indexMin = index;
		for (int i = (index + 1); i < a.length; i++) {
			if (a[i] < a[indexMin] && a[i] > 0) {
				indexMin = i;
			}
		}
		return indexMin;
	}

	// hàm tìm vị trí các số dương nhỏ nhất
	public static void viTriCacSoDuongNhoNhat(int a[]) {
		int index = timViTriDuongDau(a);
		int indexMin = timViTriDuongNhoNhat(a, index);
		System.out.println("Vị trí các số Dương nhỏ nhất là: ");
		for (int i = indexMin; i < a.length; i++) {
			if (a[i] == a[indexMin]) {
				System.out.print(i + "\t");
			}
		}

	}

	// Hàm in kết quả
	public static void inKetqua(int a[]) {
		int index = timViTriDuongDau(a);
		if (index == -1) {
			System.out.println("Hàm Không có số dương");
		} else {
			System.out.println("Số Dương nhỏ nhất là: " + a[timViTriDuongNhoNhat(a, index)]);
			viTriCacSoDuongNhoNhat(a);
		}
	}
}
