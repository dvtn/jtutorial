package cn.dvtn_01;

/**
 * 
 * 异常：程序出现了不正常的情况。
 * 
 * 程序的异常：Throwable
 * 		严重问题：Error 不处理，这种问题一般都是很严重的，比如说内存溢出。
 * 		问题：Exception
 * 			编译期问题: 不是RuntimeException都是编译期异常 必须进行处理，如果不处理，编译就不能通过
 * 			运行期问题: RuntimeException 这种问题我们不处理，因为是你的问题，而这个问题出现肯定是我们的代码不够严谨，需要修正代码。
 *
 * 如果程序出现问题，我们没有处理，虚拟机就默认进行了处理。把异常的名称、原因及出现的原因等信息输出在控制台,同时会结束程序。
 * 
 * 我们自己如何处理异常呢？
 * 		1) try....catch...finally的处理格式
 * 			try{
 * 				可能出现问题的代码；
 * 			} catch(异常名 变量){
 * 				针对问题的处理；
 * 			}
 * 			finally{
 * 				释放资源；
 * 			}
 * 
 * 			变形格式： try { ... }catch(){ ... }
 * 			注意：
 * 				try里面的代码越少越好；
 * 				catch里必须有内容，哪怕是给出一个简单的提示
 * 
 * 		2) throws
 *
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}
		
		System.out.println("over");
	}

}
