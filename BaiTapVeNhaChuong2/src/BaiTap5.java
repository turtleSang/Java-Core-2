import java.util.Scanner;

public class BaiTap5 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 50;
	static final int MIN = -50;

	public BaiTap5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập số dòng");
		int soDong = nhapN();
		System.out.println("Vui lòng nhập số cột");
		int soCot = nhapN();
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		inSoNguyenToDauTien(a, soDong, soCot);
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
	//Hảm kiểm tra số Nguyên tố
	public static boolean kiemTraSoNguyenTo(int num) {
		boolean check = true;
		if (num <=1) {
			check = false;
		} else {
			for (int i = 2; i < num/2; i++) {
				if (num % i == 0) {
					check = false;
					break;
				}
			}
		}
		return check;		
	}
	//Hàm kiểm tra mảng có số nguyên tố không
	public static boolean kiemTraMang(int a[][], int soDong, int soCot) {
		boolean check = false;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (kiemTraSoNguyenTo(a[i][j])) {
					check = true;
					break;
				}
			}
			if (check) {
				break;
			}
		}
		return check;
	}
	//Hàm in ra số nguyên tố đầu tiên
	public static void inSoNguyenToDauTien(int a[][], int soDong, int soCot) {
		boolean check = kiemTraMang(a, soDong, soCot);//Kiểm tra mảng xem có số nguyên tố không
		if (!check) {// Nếu không có in ra mảng không có số nguyên tố
			System.out.println("Mảng không có số Nguyên tố");
		}else {
			check = false;		// Gán lại cho check == false chạy lại vòng lặp
			for (int i = 0; i < soDong; i++) {
				for (int j = 0; j < soCot; j++) {
					if (kiemTraSoNguyenTo(a[i][j])) {	
						check = true;
						System.out.println("Số nguyên tố đầu tiên là " + a[i][j] + " tại vị trí [" + i + "]["+j+ "]");
						break; // nếu tìm ra số nguyên tố đầu thì break khỏi vòng lặp
						
					}
				}
				if (check) { //Kiểm tra xem có tìm ra số nguyên tố chưa nếu rồi thì break để không lặp lại vòng lặp nữa
					break;
				}
			}
		}
	}
}
