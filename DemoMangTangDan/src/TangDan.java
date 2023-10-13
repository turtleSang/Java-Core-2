
public class TangDan {

	public TangDan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = -100 + (int) (Math.random()*(201));
		}
		for (int i : a) {
			System.out.print(i+ "\t");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				if (a[j]>a[i]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
		for (int i : a) {
			System.out.print(i+ "\t");
		}

	}
	
}
