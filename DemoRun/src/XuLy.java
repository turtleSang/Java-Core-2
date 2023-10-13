
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 4, 6, 8, 1, 3, 2, 1, 6 };
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		
		do {
			int i;
			int len = 1;
			for (i = head; i < a.length -1 && a[i]<a[i+1]; i++) {
				len++;
			}
			if (len > maxLen) {
				maxHead = head;
				maxLen = len;
			}
			head ++;
		} while (head < a.length);
		
		
		System.out.println("Vị trí bắt đầu dài," + maxHead);
		System.out.println("Chiều dài" + maxLen);
	}

}
