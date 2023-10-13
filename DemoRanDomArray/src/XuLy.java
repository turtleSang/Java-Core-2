
public class XuLy {
	static final int MAX = 100;
	static final int MIN = -100;
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = 10;
		int a[] = new int[n];
		
		for (int item : a) {
			item = MIN + (int) (Math.random()*(MAX - MIN + 1));;
			System.out.println(item + "\t");
		}
		

	}
	//Tạo Random
	public static int random() {
		int a = MIN + (int) (Math.random()*(MAX - MIN + 1));
		return a;
	}
}
