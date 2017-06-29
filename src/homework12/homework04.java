package homework12;

public class homework04 {
	
	//2:取出文件名http://www.baidu.com/image/girl.png
	public static void main(String[] args) {
		
		String address = "http://www.baidu.com/image/girl.png";
		String[] a = address.split("/");
		System.out.println(a[a.length-1]);
		
		
	}
	
}
