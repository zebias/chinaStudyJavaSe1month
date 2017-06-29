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
		//��Ϊ���쳣����Ҫ�ȸ���null
		//output��д��
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		//����һ���ļ�
		File file = new File("data.bin");
		//�û�����
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ�������:");
		String zi = scan.next();
		//����ԭ���Ƿ�������
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
		

		//��ȡ
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		//��ȡ�ļ�
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
