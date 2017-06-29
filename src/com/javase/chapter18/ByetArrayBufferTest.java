package com.javase.chapter18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByetArrayBufferTest {
	public static void main(String[] args) throws IOException {
		//创建字节数组输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//写入内容
		DataOutputStream dos = new DataOutputStream(baos);
		
		dos.writeInt(12234234);
		dos.writeDouble(3.14783217462408574238095734678);
		dos.writeUTF("haha,大煞笔");
		
		/**
		 * 将写入的内容用byte数组接收
		 */
		byte[] b = baos.toByteArray();
		
		/*
		 * 创建输入流
		 * 从byte数组中读取内容并接收
		 */
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
		/*
		 * 输出读取的内容
		 */
		System.out.println(dis.readInt()+"\n"+dis.readDouble()+"\n"+dis.readUTF());
	}
}
