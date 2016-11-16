package exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	 public static void main(String[] args) throws IOException {

	//public void math() throws IOException {
		File file = new File("E:\\javaExam\\exam\\config.txt");// 这时文件还不存在
		if (!file.exists()) {// 判断是否存在，若不存在则新建一个
			File parentPath = file.getParentFile();
			if (!parentPath.exists()) {// 判断目录是否存在，不存在则新建
				System.out.println("创建文件目录：" + parentPath.mkdirs());
			}
			System.out.println("创建配置文件：" + file.createNewFile());
		}
		Writer writer = new FileWriter(file);
		writer.write("1.计算XX以内所有能被XX整除的数的和以及平均数。\r\n\r\n");
		writer.write("题目要求：\r\n\r\n");
		writer.write("A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档\r\n\r\n");
		writer.write("B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！\r\n\r\n");
		writer.write("C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？\r\n\r\n");
		writer.write("对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n\r\n");
		writer.write("2.请将第四题的代码写在一个类中，作为一个单独的方法，然后在主方法中创建一个子线程，的方式，在线程中通过反射，唤醒被反射对象的方法。\r\n\r\n");
	    //	writer.write("");
		writer.flush();
		// public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = 0;
		int div = 0;
		try {
			System.out.println("请输入大于0的范围：");
			range = scan.nextInt();
			if(range<=0){
				System.out.println("输入错误！");
				return;
			}
			if(range==1){
				System.out.println("您输入的范围是1？？我看你接下来怎么办");
			}
			System.out.println("请输入大于0且小于范围值的被除数：");
			div = scan.nextInt();
			if(div<=0 || div>=range){
				System.out.println("输入错误！");
				return;
			}
		} catch (Exception e) {
			System.out.println("请输入正确的数!");
			return;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum = 0;// sum用来接收所有的数之和
		double avg = 0;// avg表示所有数的平均数
		for (int i = 1; i <= range; i++) {// i来循环找到这个数
			if (i % div == 0) {// 这个值除div余0，则这个数符合
				list.add(i);
				sum = sum + i;// 求和
				//t++;// 计数加1
				/*System.out.println("第" + t + "个数是：" + i);// 打印这个数
				if (t == 1) {// 最小值
					min = i;
				} else {max = i;// 最后一个值是最大值
				}writer.write("第" + t + "个数是：" + i + "\r\n");*/
			}
		}
		int t = list.size();
		int max = list.get(t-1), min = list.get(0);// max作为最大值，min作为最小值
		System.out.println(list);
		avg = (double) sum / t;
		System.out.println("您输入的范围是" + range + "\t共有" + t + "个这样的数" + "\t最大值是" + max + "\t最小值是" + min + "\n" + range
				+ "范围内所有能被" + div + "整除的数之和是：" + sum + "\t这些数的平均数是：" + avg);
		writer.write("您输入的范围是" + range + "\t共有" + t + "个这样的数" + "\t最大值是" + max + "\t最小值是" + min + "\r\n\r\n" + range
				+ "范围内所有能被" + div + "整除的数之和是：" + sum + "\t这些数的平均数是：" + avg);
		writer.write("\r\n\r\n所得的数为："+list.toString());
		writer.close();
		scan.close();
	}
}
// }