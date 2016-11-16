package exam;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		TestThread t = new TestThread();// 创建线程
		t.start();// 线程启动
	}
}
class TestThread extends Thread {
	public void run() {
		Class<?> class1;
		try {
			class1 = Class.forName("exam.Exam1");// 获得class实例
			Object exam1 = class1.newInstance();// 创建实例
			Method method = class1.getMethod("math");// 得到方法
			method.invoke(exam1);// 唤醒方法

		} catch (Exception e) {
			System.out.println("异常出现了！");
		}

	}
}
