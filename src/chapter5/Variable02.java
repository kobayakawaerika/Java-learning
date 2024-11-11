package chapter5;

public class Variable02 {
	
	static final int MIN_NUMBER = 10;
	
	public static void main(String[] args) {
		System.out.println(MIN_NUMBER);
		
		// 再代入しようとするとエラー
		// MIN_NUMBER = 20;
		
		final int maxValue;
		maxValue = 100;
		System.out.println(maxValue);
		
		// 再代入しようとするとエラー
		// maxValue = 200;
	}

}
