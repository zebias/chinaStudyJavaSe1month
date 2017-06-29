package com.javase.chapter17;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FilesTest {
	public static void main(String[] args) {
		File file = new File("C:/��ïʤԡ��.avi");
		try {
			file.createNewFile();  //�����ļ� (Ĭ������ĿĿ¼�´���)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(file.exists()); //�ж��ļ��Ƿ����
		System.out.println(file.isFile()); //�ж��Ƿ����ļ�
		System.out.println(file.getPath()); //��ȡ
		System.out.println(file.getAbsolutePath()); //��ȡ�ļ�·��
		System.out.println(file.length()); //��ȡ�ļ���С
		file.delete(); //ɾ���ļ�

		System.out.println("------------------------------");
		File[] listFiles = new File("C:\\opt\\").listFiles();  //���Ŀ¼�µ����ļ�(Ŀ¼)
		for (File file2 : listFiles) { 
			System.out.println(file2);
		}

		System.out.println("------------------------------");
		//�鿴��ǰ·���µ�java�ļ�
		String[] list = new File("c:\\opt\\").list();
		
		//�����ļ�
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("------------------------------");
		//�鿴 �����ڲ���
			String[] list2 = new File("c:\\opt\\").list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String fname) {
					return fname.endsWith(".pptx");
				}
			});
			
			for (int j = 0; j < list2.length; j++) {
				System.out.println(list2[j]);
			}
		for (int i = 0; i < 100; i++) {
		FilesTest.getFile("E:/haha" + i, "��ïʤ");
		}
	}

	//�����ļ�
	public static boolean getFile(String path,String fileName){
		boolean success = false;
		String path1 = path;
		String fileName2 = fileName;
		try {
		File file = new File(path);
		if(!file.isDirectory()){
			file.mkdirs();
		}
		File file2 = new File(path1+File.separator+fileName2+".txt");
		
			success = file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
}
