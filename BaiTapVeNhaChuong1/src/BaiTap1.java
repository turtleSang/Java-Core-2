
import java.util.Scanner;

public class BaiTap1 {
	static Scanner scan = new Scanner(System.in);
	public BaiTap1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = nhapMang();
		xuatMang(a);
		xuatKetQua(a);

	}
	//Kiểm tra số đó có dạng là 3^k không
	public static boolean kiemTraSo(int num) {
		if (num%3 != 0 || num <=0) {	//nếu num % 3 !=0 hoặc là num <=0 thì số đó không có dạng 3^k
			return false;
		}else {
			while(num % 3 == 0) {//Thực hiện chia ba số num đến khi phép chia có dư khác 0
				num /=3;		//Gán Num = num /3 
			}
			if (num == 1) {
				return true; //Nếu chia đến khi có dư mà num = 1 thì num là số có dạng 3^k
			} else {
				return false; // Nếu chia ra num != 1 thì num không có dạng 3^k
			}
		}
	}
	//Hàm đếm xem bên trong mảng có bao nhiêu số thỏa điều kiện
	public static int demSoThoaDieuKien(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (kiemTraSo(a[i])) {
				count++;
			}
		}
		return count;
	}
	//Hàm xuất mảng chứa các số mũ có dạng 3^k
	public static void xuatKetQua(int a[]) {
		int count = demSoThoaDieuKien(a);
		if (count == 0) {
			System.out.println("Trong mảng không có số nào có dạng 3^k");
			System.out.println("Kết quả  = " + count);
		} else {
			System.out.println("Các số có dạng 3^k là:");
			for (int i = 0; i < a.length; i++) {
				if (kiemTraSo(a[i])) {
					System.out.print(a[i] + "\t");
				}
			}
		}
				
	}
	//Hàm Xuất mảng
	public static void xuatMang(int a[]) {
		System.out.println("Mảng vừa nhập có các giá trị");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static int nhapChieuDaiMang() {
		int n;
		do {
			System.out.println("Vui lòng nhập chiều dài mảng > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
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
