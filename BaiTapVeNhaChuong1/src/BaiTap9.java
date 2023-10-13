import java.util.Scanner;

public class BaiTap9 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 1000;
	static final int MIN = -1000;

	public BaiTap9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		float trungBinhSoNguyenTo = tinhTBCacSoNguyenTo(a);
		System.out.println("\nTrung bình các số nguyên tố là: " + trungBinhSoNguyenTo);
	}

	// Kiểm tra số nguyên tố bằng
	public static boolean kiemTraNguyenTo(int b) {
		// Số nguyên tố phải lớn hơn 1 nếu không lớn hơn 1 return false
		if (b < 2) {
			return false;
		}

		// Nếu số b chia hết cho bất kỳ số nào trong đoạn từ i - b/2 trả kết quả là false
		for (int i = 2; i <= b/2; i++) {
			if (b % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static float tinhTBCacSoNguyenTo(int a[]) {
		int tongSoNguyenTo = 0;
		int demSoNguyenTo = 0;
		System.out.println("Các số nguyên tố là: ");
		for (int i = 0; i < a.length; i++) {
			
			if (kiemTraNguyenTo(a[i])) {
				tongSoNguyenTo += a[i];
				demSoNguyenTo++;
				System.out.print(a[i] + "\t");
			}
		}
		if (demSoNguyenTo == 0) {
			System.out.println("Không có số nguyên tố trong mảng");
			return 0;
		} else {
			float ketQua = tongSoNguyenTo*1.0f/demSoNguyenTo;
			return ketQua;
		}
		
	}

	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);

		return n;
	}

	// Hàm xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng ngẫu nhiên có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	// Hàm tạo mảng
	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}

}
