import java.util.Scanner;

public class BaiTap8 {
	static final int MIN = -1000;
	static final int MAX = 1000;
	static Scanner scan = new Scanner(System.in);
	public BaiTap8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = taoMang();
		xuatMang(a);
		int tongCacSoThoaDieuKien = tinhTongSoLonHonTriTuyetDoi(a);
		System.out.println("Tổng các số có giá trị lớn hơn giá trị tuyệt đối của số liền sau là: " + tongCacSoThoaDieuKien);
	}
	public static int nhapN() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài n của mảng (n > 0)");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);

		return n;
	}
	//Hàm xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng ngẫn nhiên  có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Hàm tạo mảng
	public static int[] taoMang() {
		int a[] = new int[nhapN()];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN)) + 1);
		}
		return a;
	}
	
	
	public static int tinhTongSoLonHonTriTuyetDoi(int a[]) {
		int sum = 0;
		//Đầu tiên cho vòng lặp chạy từ vị trí 0 đến vị trí thứ a.length - 1
		System.out.println("Các số có giá trị lớn hơn giá trị tuyệt đối của số liền sau là");
		for (int i = 0; i < a.length-1; i++) {
			int triTuyetDoiSoSau = Math.abs(a[i+1]);//Tính giá trị tuyệt đối số liền sau
			if (a[i] > triTuyetDoiSoSau) { //Nếu a[i] lớn hơn trị tuyệt đối số liền sau thì cộng thêm a[i]
				System.out.print(a[i] + "\t");
				sum += a[i];
			}
		}
		System.out.println();
		return sum;
	}
	
	
}
