package homework12;

import java.util.Scanner;

public class homework02 {
	//�������,��jvm����
	public static void main(String[] args) {
		// �ж�������Ƿ���9λ��QQ����
		// �û�����
		Scanner scan = new Scanner(System.in);
		//��ʾ�û���������(ѭ������)
		while(true){
			System.out.println("������QQ����:");
			//ʹ���ַ���������
			String qqNum = scan.next();
			
			//����������ַ��������Ƿ����Ҫ��(�ַ���.length())
			//�������Ҫ���ټ���
			if(qqNum.length()==9){
				
				//�ж�������ַ��Ƿ���0��ͷ
				
				if(qqNum.charAt(0)!='0'){
					
					//��һ��char��������ַ�
					char[] num = new char[9];
					
					//��������
					for(int i = 0;i<qqNum.length();i++){
						num[i] = qqNum.charAt(i);
						System.out.print(num[i]);
					}
					
					//��������������Ƿ�Ϊ������
					for(char num2 : num){
						
						//�ж�
						if(num2 > 57 || num2 < 48){
							System.out.println("������Ҫ��,�����봿����");
							//������������
							return;
						}
						
					}
					if(true){
					System.out.println("�Ϸ�.�����������ȷ��QQ����");
					scan.close();
					return;
					}
					
				}else{
					System.out.println("�������ֵ������0��ͷ");
				}
			}else{
				System.out.println("���Ȳ���");
			}

		}
	}
}
