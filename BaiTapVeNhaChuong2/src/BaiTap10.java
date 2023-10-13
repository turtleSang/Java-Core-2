import java.util.Scanner;

public class BaiTap10 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;

	public BaiTap10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		lietKeCacDongCoChuaGiaTriAm(a, soDong, soCot);

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
	//Đếm số dòng có chứa giá trị âm
	public static int demDongCoChuaGiaTriAm(int a[][], int soDong, int soCot) {
		int dem = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] < 0) {
					dem++;
					break;
				}
			}
		}
		return dem;
	}
	//Kiểm tra dòng thứ i có chứa số âm không 
	public static boolean kiemTraDong(int a[][], int i ,int soCot) {
		for (int j = 0; j < soCot; j++) {
			if (a[i][j] < 0) {
				return true;
			}
		}
		return false;
	}
	//Liệt kê các dòng chứa giá trị âm
	public static void lietKeCacDongCoChuaGiaTriAm(int a[][], int soDong, int soCot) {
		int dem = demDongCoChuaGiaTriAm(a, soDong, soCot);
		if (dem == 0) {
			System.out.println("Không có dòng nào chứa giá trị âm");
		} else {
			System.out.println("Có "+ dem +" dòng chứa giá trị âm là: ");
			for (int i = 0; i < soDong; i++) {
				if (kiemTraDong(a, i, soCot)) {
					System.out.print("Dòng " + i + "\t");		
				}
			}						
		}
	}

}
