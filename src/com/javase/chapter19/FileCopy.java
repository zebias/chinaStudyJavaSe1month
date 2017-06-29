package com.javase.chapter19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//通过字节流
		//先读取文件
		FileInputStream fis = new FileInputStream("c:/shop.txt");
		//后写入文件
		FileOutputStream fos = new FileOutputStream("c:/shop1.txt");
		
		//先读后写
		//用byte数组读
		byte[] b = new byte[1024];
		int i = fis.read(b, 0, b.length);
		while(i != -1){
			//再写
			fos.write(b,0 ,i);
			//循环读
			i=fis.read(b, 0, b.length);
		}
		fis.close();
		fos.close();
	}
}
