package com.javase.chapter18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByetArrayBufferTest {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//д������
		DataOutputStream dos = new DataOutputStream(baos);
		
		dos.writeInt(12234234);
		dos.writeDouble(3.14783217462408574238095734678);
		dos.writeUTF("haha,��ɷ��");
		
		/**
		 * ��д���������byte�������
		 */
		byte[] b = baos.toByteArray();
		
		/*
		 * ����������
		 * ��byte�����ж�ȡ���ݲ�����
		 */
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
		/*
		 * �����ȡ������
		 */
		System.out.println(dis.readInt()+"\n"+dis.readDouble()+"\n"+dis.readUTF());
	}
}
