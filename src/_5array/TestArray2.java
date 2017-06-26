package _5array;

public class TestArray2 {
	public static void main(String[] args) {
		int[] a = { 5, 4, 2, 45, 9, 11, 31 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j <i; j++) {

				if (a[i] > a[i + 1]) {
					int num;
					num = a[i];
					a[i] = a[i + 1];
					a[i + 1] = num;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
