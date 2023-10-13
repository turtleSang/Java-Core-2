import java.util.Scanner;

public class BaiTap4 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;

	public BaiTap4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		timSoAmLonNhat(a, soDong, soCot);

	}

	// Hàm nhập N
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập giá trị lớn hơn 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	// Hàm tạo Mảng
	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * (MAX - MIN + 1));
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
	//Tìm giá trị âm lớn nhất
	public static void timSoAmLonNhat (int a[][], int soDong, int soCot) {
		//Đầu tiên kiểm tra xem có số âm trong mảng không
		boolean check = false;
		int i = 0;
		int j = 0;
		for (i = 0; i < soDong; i++) {
			for (j = 0; j < soCot; j++) {
				if (a[i][j]<0) {
					check = true;
					break;
				}
			}
			if (check) {
				break;
			}
		}
		// tìm ra số âm lớn nhất
		if (!check) {//Nếu trong mảng không có số âm  xuất ra
			System.out.println("Trong mảng không có số âm");
		}else { // Nếu có số âm gán vị trí âm là i và j
			int maxRow = i;
			int maxCol = j;
			for (i = 0; i < soDong; i++) {
				for (j = 0;  j < soCot; j++) {
					if (a[i][j]>a[maxRow][maxCol] && a[i][j] < 0) {
						maxRow = i;
						maxCol = j;
					}
				}
			}
			System.out.println("Số âm có giá trị lớn nhất là " + a[maxRow][maxCol]);
		}
		
		
	}
	
	
	
}
