package com.javase.chapter;

public class Hero {
	/*
	 * 1.�Զ���һ��Ӣ���� ,Ӣ�۵ļ������Ϊ0�����Ϊ30��������ֵ���Ϊ0�����Ϊ30��ʱ�ľ���ֵ
	 * ������Ҫ����һ�����в����Ĺ��캯��������ΪӢ�۵ľ���ֵ��
	 * ��ʼ��ʱҪ��֤����ֵ��Ҫ��Χ֮�ڣ�ͨ������ֵ����Ӣ�۵ļ���
	 * Ӣ�۵ļ�����㹫ʽ���£� N=��ǰ����EXP������ֵ��=30��N^3+5N��-80 
	 * ����һ���޲εĹ��췽����������ֵ����Ϊ0
	 * ����Ӣ�����޲κʹ��в����Ĺ��캯���ֱ𹹽�Ӣ�۶��󣬲����Ӣ�۵ĵȼ��;���ֵ��
	 * 
	 * 
	 */
	
	
	//��������
	private int level;	//�ȼ�
	private int exp;	//����
	
	//�вι��췽��
	public Hero(int level){
		//����Сֵ�����ֵ��Χ����
		if(this.level>=0 && level<=30){
		//��ȡ��ǰ����
			int temp = 30*(level*level*level+5*level)-80;
			
			if(temp>=0){
				this.exp = temp;
			}else{
				this.exp = 0;
			}
			
		}else if(level<0){
			this.level = 0;
			this.exp = 0;
		}else{
			this.level = 30;
			this.exp = 30*(30*30*30+5*30)-80;
		}
		System.out.println("Ӣ�۵ĵȼ���"+level+"\nӢ�۵ľ���ֵ��"+exp);
	
	}
	
	
	//�޲ι��췽��
	public Hero(){
		this.exp = 0;
	}
	
	//���巽��
	public void getExp(int level){
		//����Сֵ�����ֵ��Χ����
				if(this.level>=0 && level<=30){
				//��ȡ��ǰ����
					int temp = 30*(level*level*level+5*level)-80;
					
					if(temp>=0){
						this.exp = temp;
					}else{
						this.exp = 0;
					}
					
				}else if(level<0){
					this.level = 0;
					this.exp = 0;
				}else{
					this.level = 30;
					this.exp = 30*(30*30*30+5*30)-80;
				}
				System.out.println("Ӣ�۵ĵȼ���"+level+"\nӢ�۵ľ���ֵ��"+exp);
	}
	
	
	
}
