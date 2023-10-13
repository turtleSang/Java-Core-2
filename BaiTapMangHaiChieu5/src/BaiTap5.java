import java.util.Scanner;

public class BaiTap5 {
	static Scanner scan = new Scanner(System.in);
	public BaiTap5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập vào chiều dài ma Trận Vuông");
		int n = nhapN();
		int a[][] = nhapMang(n);
		xuatMang(a, n);
		boolean flag = kiemTraMangDoiXung(a, n);
		if (flag) {
			System.out.println("Mảng A là Mảng đối xứng");
		} else {
			System.out.println("Mảng A là mảng không đối xứng");
		}
		int tongChinh = tinhTongPTTamGiacTrenDuongCheoChinh(a, n);
		System.out.println("Tổng Tam Giác Trên Đường chéo Chính là " + tongChinh);
		int tongPhu = tinhTongPTTamGiacTrenDuongCheoPhu(a, n);
		System.out.println("Tổng Tam Giác Trên đường chéo phụ là: " + tongPhu);

	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập vào số lớn hơn >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n<2);
		return n;
	}
	public static int[][] nhapMang(int n) {
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("a[" +i+ " ][ "+j + "] = ");
				a[i][j]= Integer.parseInt(scan.nextLine());
				
			}
		}
		return a;		
	}
	public static void xuatMang(int a[][],int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean kiemTraMangDoiXung(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != a[j][i]) {
					return false;
				}
			}
		}
		
		return true;
	}
	public static int tinhTongPTTamGiacTrenDuongCheoChinh(int a[][], int n) {
		int sum =0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				sum+= a[i][j];
			}
		}
		return sum;
	}
	public static int tinhTongPTTamGiacTrenDuongCheoPhu(int a[][], int n) {
		int sum =0;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				sum+= a[i][j];
			}
		}
		return sum;
	}
}
