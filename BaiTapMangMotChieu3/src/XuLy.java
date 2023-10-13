import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	static final int MIN = -100;
	static final int MAX = 100;
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapN();
		int a[]= taoMang(n);
		xuatMang(a);
		
		int viTriAmDauTien = timSoAmDau(a);
		System.out.println("\nVị Trí âm Đầu tiên là: " +(viTriAmDauTien+1));
		timGiaTriGiong(a);
		
	}


	// Tạo số ngâu nhiên
	public static int random() {
		int a = MIN + (int) (Math.random()*(MAX-MIN+1));
		return a;
	}
	
	//Nhập n
	public static int nhapN() {
		System.out.println("Vui lòng nhập vào số N:");
		int n;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n <= 0) {
				System.out.println("Vui lòng nhập lại số N > 0");
			}
		} while (n<0);
		return n;
	}
	
	//hàm tạo mảng 
	public static int[] taoMang(int n) {
		int a[] = new int [n];
		for (int i = 0; i < n; i++) {
			a[i] = random();
		}
		return a;
	}
	
	// Hàm xuất mảng
		public static void xuatMang(int a[]) {
			System.out.println("Mảng dược lại ra là");
			for (int pt : a) {
				System.out.print(pt + "\t");
			}
		}
	
	//Hàm ìm ra vị trí đầu tiên chứa số âm
	public static int timSoAmDau(int a[]) {
		int viTriSoAmDau = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0) {
				viTriSoAmDau = i;
				break;
			}
		}
		return viTriSoAmDau;		
	}
	
	public static void timGiaTriGiong(int a[]) {
		int viTriSoAmDau = timSoAmDau(a);
		if(viTriSoAmDau>=0) {
			System.out.print("Vị trí các phần tử bằng với số âm đầu tiên là: ");
			int flag = -1;
			for (int i = viTriSoAmDau +1; i < a.length; i++) {
				if (a[i] == a[viTriSoAmDau]) {
					System.out.print( i+ "\t");
					flag =i;
				}
			}
			if (flag == -1) {
				System.out.println("Không có giá trị nào giống với giá trị âm Đầu tiên");
			}
		} else {
			System.out.println("Mảng không có số âm");
		}
	}
	
	
	
	
}
