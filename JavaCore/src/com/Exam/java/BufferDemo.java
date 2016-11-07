package com.Exam.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		InputStream in= new FileInputStream("E:\\soft\\Vedeo\\74FileDemo_2016-11-03_190314.wmv");
        BufferedInputStream bis=new BufferedInputStream(in);
        OutputStream os= new FileOutputStream("C:\\Users\\Administrator.PC-20160414BMFJ\\Desktop\\copy1.wmv");
        BufferedOutputStream bos=new BufferedOutputStream(os);
     //定义一个数组来接收缓存
        byte[] b=new byte [1024];
    //   int bisReader=0;
       while((bis.read(b))!=-1){
    	   bos.write(b);
    	   //标记已读取位置
    	   //bis.mark(1024);
    	   //从这里继续读取
    	   // bis.reset();
    	 if(bis.available()<=1024){
    		  //System.out.println(bis.read(b));
    		   byte[] nb=new byte[bis.available()];
    		   bis.read(nb);
    		   bos.write(nb);
    		   break;
    	   }
       }
        in.close();
        bos.close();
        os.close();
        bis.close();
        System.out.println("复制完成！");
	
	}
}