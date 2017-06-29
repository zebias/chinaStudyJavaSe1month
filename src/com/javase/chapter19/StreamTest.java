package com.javase.chapter19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StreamTest {
	public static void main(String[] args) {
		//fis  FileInputStream
		//fos  FileOutputStream
		//baos BypeArrayOutputStream
		//dos  DataOutputStream
		//dis DataInputStream
		//�ֽ���
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//�������
		DataOutputStream dos = new DataOutputStream(baos);
		try {
			dos.writeInt(123);
			dos.writeDouble(3.213124);
			dos.writeUTF("�Ҳ�!");
			//��д���������byte[]����
			byte[] b = baos.toByteArray();
			

			//����������
			DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
			System.out.println(dis.readInt()+"\r\n"+dis.readDouble()+"\r\n"+dis.readUTF());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}