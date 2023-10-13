import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] =  {1, 3, 5, 1, 2, 4, 7, 1};

		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("Vui Lòng nhập số muốn xóa");
		int soXoa = Integer.parseInt(scan.nextLine());
		a = xoaSo(a, soXoa);
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
	public static int demSoCanXoa(int a[], int soXoa) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == soXoa) {
				count++;
			}
		}
		return count;
	}
	public static int[] xoaSo(int a[], int x) {
		int count = demSoCanXoa(a, x);
		int b[] = new int[a.length- count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!= x) {
				b[j] = a[i];
				j++;
			}
		}
		a =b;
		return a;
		
	}
}
