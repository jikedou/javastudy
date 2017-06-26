package _5array;

public class Test {
	public static void main(String[] args) {
		int a=1;int b=3;
		int c=0;
//		change(a, b);
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
	public static void change(int i, int j) {
		int num=0;
		num=i;
		i=j;
		j=num;
	}
}
