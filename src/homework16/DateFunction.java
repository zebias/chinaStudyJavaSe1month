package homework16;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * @author Administrator
 *1.��дһ�����ڹ����ࣺDateFunction
�����·�����
(1) public static java.uitl.Date getCurrentDate() //ȡ�õ�ǰ����
(2 )public static String getCurrentShortDate () //���ص�ǰ�����ո�ʽ���ڣ�yyyy-mm-dd
(3) public static String getCurrentDateTime() //ȡ�õ�ǰ���ں�ʱ�� ��ʽ��yyyy-mm-dd hh:mi:ss
(4) public static String getCurrentChineseDate() //���� ��yyyy��xx��xx�ա���ʽ������
(5) public static java.util.Date convertToDate(String currentDate) throws Exception //���ַ�������ת��Ϊ�������ͣ� �ַ�����ʽΪ��yyyy-mm-dd, ���ת��ʧ�ܣ��׳�ת���쳣
(6) public static java.util.Date convertToLongDate(String currentDate) throws ConvertException //������ʱ�䣺yyyy-mm-dd hh:mi:ss ת��Ϊ�������ͣ����ת��ʧ���׳�ת���쳣��
(7) public static String convertToDateString(java.sql.Date  date) //����������ת��Ϊ�ַ������ͣ���ʽ��yyyy-mm-dd
(8) public static String convertToDateTimeString(java.sql.Date date) //������ת��Ϊ�ַ�������ʽΪ��yyyy-mm-dd hh:mi:ss
��д������Test�������з������в��ԡ�
**/



public class DateFunction {
		/**
		 * 
		 * @author Administrator ��Ŀ1:ȡ�õ�ǰ����
		 */
		public static Date getCurrentDate() {
			Date date = Calendar.getInstance().getTime();
			return date;
		}
		 /** 
		 * @return:���ص�ǰ�����ո�ʽ����
		 */
		public static String getCurrentShortDate(){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			String str = format.format(getCurrentDate());
			return str;
		}
		/**
		 * 
		 * @return:ȡ�õ�ǰ���ں�ʱ�� ��ʽ��yyyy-mm-dd hh:mi:ss
		 */
		public static String getCurrentDateTime(){

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			return format.format(getCurrentDate());
			
		}
		
		/**
		 * 
		 * @return:���� ��yyyy��xx��xx�ա���ʽ������
		 */
		public static String getCurrentChineseDate(){
			SimpleDateFormat format = new SimpleDateFormat("yyyy��mm��dd��");
			return format.format(getCurrentDate());
			//return c1.get(Calendar.YEAR)+"��"+c1.get(Calendar.MONTH)+"��"+c1.get(Calendar.DAY_OF_MONTH)+"��";
		}
		
		/**
		 * 
		 * @param currentDate:�����б����
		 * @return:���ַ�������ת��Ϊ�������ͣ� �ַ�����ʽΪ��yyyy-mm-dd, ���ת��ʧ�ܣ��׳�ת���쳣
		 * @throws ParseException 
		 */
		public static Date convertToDate(String currentDate) throws ParseException{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			//currentDate = "2017-2-4";
			
				return format.parse(currentDate);
		}
		
		/**
		 * 
		 * @param currentDate:�����б����
		 * @return:������ʱ�䣺yyyy-mm-dd hh:mi:ss ת��Ϊ�������ͣ�
		 * @throws ParseException :���ת��ʧ���׳�ת���쳣��
		 */
		public static java.util.Date convertToLongDate(String currentDate) throws ParseException{

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

			//currentDate = "2017-2-4 3:20:40";
			
			
			return format.parse(currentDate);
			
		}
		
		/**
		 * 
		 * @param date:
		 * @return:����������ת��Ϊ�ַ������ͣ���ʽ��yyyy-mm-dd
		 */
		public static String convertToDateString(java.sql.Date date2){

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			return format.format(date2);
			
		}
		/**
		 * 
		 * @param date
		 * @return:������ת��Ϊ�ַ�������ʽΪ��yyyy-mm-dd hh:mi:ss
		 */
		public static String convertToDateTimeString(java.sql.Date date2){
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			
			return format.format(date2);
			
		}
		
		
}
