package test.main;

public class test {
	
	
	public static void main(String[] args) {
		String strTest = Asdf("야","고");
		System.out.println(strTest);
		
		int sum = sum(3,4);
		System.out.println(sum);
		
		String mem1=mem("가가", "나나"); {
			System.out.println(mem1);
			
		int ave=avg(10, 20);
		System.out.println(ave);
		}
	}
	
	public static String Asdf(String c, String d) {
		return c+d;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static String mem(String a, String b) {
		return a+b;
	}
	
	public static int avg(int a, int b) {
		return (a+b)/2;
	}
}
