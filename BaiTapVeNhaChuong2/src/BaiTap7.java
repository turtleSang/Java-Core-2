import java.util.Scanner;

public class BaiTap7 {
	static Scanner scan = new Scanner(System.in);

	public BaiTap7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = nhapMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int cot = nhapCotKiemTra(soCot);
		kiemTraCotGiamDan(a, soDong, cot);
	}

	// Hàm Nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	// Hàm nhập mảng
	public static int[][] nhapMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "][" + j + "] =");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}

	// Hàm Xuất Mảng
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Hàm nhập cột kiểm tra
	public static int nhapCotKiemTra(int soCot) {
		System.out.println("Vui lòng nhập cột màn bạn muốn kiểm tra");
		int cot;
		do {
			cot = Integer.parseInt(scan.nextLine());
			if (cot < 0) {
				System.out.println("Vui lòng nhập lại số cột lớn hơn 0");
			}else if (cot > soCot) {
				System.out.println("Vui lòng nhập lại số cột nhỏ hơn " + soCot );
			}
		} while (cot < 0 || cot > soCot);
		return cot;
	}
	//Hàm kiểm tra cột người dùng nhập vào
	public static void kiemTraCotGiamDan(int a[][], int soDong, int cot) {
		boolean check = true;
		for (int i = 1; i < soDong; i++) {
			if(a[i][cot] > a [i-1][cot] ) {
				check = false;
			}
		}
		if (check) {
			System.out.println("Cột thứ " + cot + " có các giá trị giảm dần");
		} else {
			System.out.println("Cột thứ " + cot + " không có các giá trị giảm dần");
		}
	}
}
