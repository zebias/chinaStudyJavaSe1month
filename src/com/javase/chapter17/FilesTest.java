package com.javase.chapter17;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FilesTest {
	public static void main(String[] args) {
		File file = new File("C:/李茂胜浴室.avi");
		try {
			file.createNewFile();  //创建文件 (默认在项目目录下创建)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(file.exists()); //判断文件是否存在
		System.out.println(file.isFile()); //判断是否是文件
		System.out.println(file.getPath()); //获取
		System.out.println(file.getAbsolutePath()); //获取文件路径
		System.out.println(file.length()); //获取文件大小
		file.delete(); //删除文件

		System.out.println("------------------------------");
		File[] listFiles = new File("C:\\opt\\").listFiles();  //输出目录下的子文件(目录)
		for (File file2 : listFiles) { 
			System.out.println(file2);
		}

		System.out.println("------------------------------");
		//查看当前路径下的java文件
		String[] list = new File("c:\\opt\\").list();
		
		//遍历文件
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("------------------------------");
		//查看 匿名内部类
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
		FilesTest.getFile("E:/haha" + i, "李茂胜");
		}
	}

	//创建文件
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
