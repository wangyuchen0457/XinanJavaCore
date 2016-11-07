package com.Exam.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqrtExam {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\javademo\\exam\\config.txt");// 这时文件还不存在
		if (!file.exists()) {// 判断是否存在，若不存在则新建一个
			File parentPath = file.getParentFile();
			if (!parentPath.exists()) {// 判断目录是否存在，不存在则新建
				System.out.println("创建文件目录：" + parentPath.mkdirs());
			}
			System.out.println("创建配置文件：" + file.createNewFile());
		}
		Writer writer = new FileWriter(file);
		writer.write("这是一个java上机题的文档文件：\r\n");
		writer.write("一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\r\n");
		writer.write("需要的参数如下：通过本程序读取本文件，解析下面的字符串得到需要的参数值：\r\n");
		writer.write("100#168#1000\r\n");
		writer.write("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂逻辑\r\n");
		writer.write("将计算的结果，最后再写回这个配置文件的尾部，有多个结果时换行输出，以方便阅读。\r\n");
		writer.flush();// 刷新缓冲
		InputStream is = new FileInputStream(file);
		Scanner scanner = new Scanner(is);

		// System.out.println("文件的内容是：");
		String regex = "\\d+#\\d+#\\d+";// 用正则表达式检测出数字#数字#数字的行
		Integer[] a = new Integer[3];// 定义一个数组用来接收参数
		// 判断是否有下一行
		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();// 判断是否有下一行
			if (!str.matches(regex)) {// 判断当前行是否是参数行
				System.out.println("读取当前行内容：" + str);// 打印文件内容
			} else {// 参数行
				System.out.println("读取当前行内容：" + str);
				Pattern p = Pattern.compile("[\\d\\.]+");// 实例化p作为判断条件正则表达式检测出数字串
				Matcher m = p.matcher(str);// 实例化m进行判断
				int i = 0;// 数组的索引值
				System.out.print("参数值为：");
				while (m.find()) {// 找到数字串时
					a[i] = Integer.valueOf(m.group());// 对数组a赋值
					System.out.print(a[i] + " "); // 打印参数
					i++;
					
				}
				break;
			}
		}
		writer.write("解题思路 ：\r\n");
		writer.write("首先判断配置文件是否存在，如果不存在则新建这个文件以及对应的文件夹\r\n");
		writer.write("首先考虑用scanner来读取文件内容，检测到数字和#的一行用正则表达式将参数转化为整形赋给一个数组。\r\n");
		writer.write("然后将数组的值对应为需要计算的参数，计算这个正整数需要用一个循环遍历1到1000以内的所有数。\r\n");
		writer.write("然后判断这个数加上100是否是完全平方数，再加168是否是完全平方数，两个条件都符合则输出这个数。\r\n");
		writer.write("然后将这个数写入到文件中并换行\r\n");
		// 数组a[]={100,168,1000}
		System.out.println();
		System.out.println("这个正整数为：");
		//int n;
		writer.write("这个正整数为：\r\n");
		/*for (int i = 1; i < a[2]; i++) {// n在1到a[2]之间
			// 如果这个值加100 的平方根为整数 再加168的平方根也为整数，则输出
			if (Math.sqrt(i + a[0]) % 1 == 0 && Math.sqrt(i + a[0] + a[1]) % 1 == 0) {
				System.out.println(i);
				writer.write(i + "\r\n");// 将所得结果写入到文件中并换行
			}
		}*/
		//循环i j作为这个数加100和加268的数
		for(int i=1;i<100;i++){
        	for(int j=1;j<100;j++){
        		int b=i*i-a[0];
        		if(j*j-i*i==a[1] && b>=0 && b<=a[2]){
        			System.out.println(b);
        			writer.write(b+"\r\n");
        		}
        		}
        	}
		writer.close();// 关闭writer
		scanner.close();// 关闭scanner
	}
}