package cn.dvtn_01;


/**
 * JDK1.7异常新特性: JDK7新异常处理方案
 * 		try{
 * 		} catch(异常名1|异常名2|异常名3| ... 变量)
 * 		{	
 * 		}
 * 		
 * 注意： 这个方式虽然简洁，但也不够好
 * 	1.处理方式是一致的（实际开发中，好多时候可能就是针对同类型的问题，给出统一处理）
 * 	2.各个异常间必须是同级关系
 *
 */

public class ExceptionDemo2 {
	public static void main(String[] args) {
		method();
		method2();
	}

	public static void method() {
		int a = 10;
		int b = 0;
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚，该怎么办？");
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组访问越界");
		}catch (Exception e) {
			System.out.println("出问题了");
		}
		
	}
	
	//JDK7处理方案
	public static void method2() {
		int a = 10;
		int b = 0;
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚，该怎么办？");
		} catch (Exception e) {
			System.out.println("出问题了");
		}

	}
}
