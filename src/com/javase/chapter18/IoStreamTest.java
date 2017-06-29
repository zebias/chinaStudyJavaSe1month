package com.javase.chapter18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoStreamTest {

	public static void main(String[] args) {
		//因为有异常所以要先给个null
		//output是写入
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		//创建一个文件
		File file = new File("data.bin");
		//用户输入
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你要输出的字:");
		String zi = scan.next();
		//看看原本是否有内容
		try {
			fos = new FileOutputStream(file,true);
			dos = new DataOutputStream(fos);
			dos.writeInt(123456);
			dos.writeDouble(3.1415926);
			dos.writeUTF(zi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(fos != null){
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		if(dos != null){
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
		scan.close();
		

		//读取
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		//获取文件
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			System.out.println(dis.readInt()+"\n"+dis.readDouble()+"\n"+dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(fis != null){
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(fis != null){
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
