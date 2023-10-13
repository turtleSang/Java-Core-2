import java.util.Scanner;

public class bai10 {
	static Scanner scan = new Scanner(System.in);
	static final int MAX = 100;
	static final int MIN = -100;
	
	public bai10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapN();
		int a[] = taoMang(n);
		xuatMang(a);
		System.out.println("Xáo trộn giá trị mảng");
		System.out.println("Mảng a Mới hình thành là");
		int b[] = shuffle(a);		
		xuatMang(b);		
		int count = count(a,b);
		System.out.println("Sau " + count + " lần đổi thì sẽ quay lại mảng a");
		
	}
	// Hàm Nhập Random
	public static int random() {
		int x = MIN + (int) (Math.random() * (MAX - MIN + 1));
		return x;
	}
	//Hàm xuất mảng
	public static void xuatMang(int a[]) {
		
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	//Hàm nhập N
	public static int nhapN() {
		int n;
		System.out.println("Vui lòng nhập vào N");
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n <= 2 || n%2 != 0) {
				System.out.println("Vui Lòng nhập N > 0 và N chẵn");
			}
		} while (n <= 2 || n%2 != 0 );
		return n;
	}
	// Hàm Random
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random();
		}
		return a;
	}
	//Hàm trộn trộn shuffle
	public static int[] shuffle(int a[]) {
		int tam[] = new int[a.length];
		for (int i = 0; i < a.length/2; i++) {
			tam[2*i] = a[i];
			tam[2*i+1] = a[a.length/2+i];
		}
		a = tam;
		return a;
	}
	//Hàm so sánh mảng
	public static boolean isEqua(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]!= b[i]) {
				return false;
			}
		}
		return true;
	}
	public static int count(int a[], int b[]) {
		int count = 0;
		do {
			b = shuffle(b);
			count++;
			xuatMang(b);
		} while (!isEqua(a, b));
		
		return count;		
	}	
}
