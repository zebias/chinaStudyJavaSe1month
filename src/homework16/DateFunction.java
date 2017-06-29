package homework16;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * @author Administrator
 *1.编写一个日期功能类：DateFunction
有如下方法：
(1) public static java.uitl.Date getCurrentDate() //取得当前日期
(2 )public static String getCurrentShortDate () //返回当前年月日格式日期：yyyy-mm-dd
(3) public static String getCurrentDateTime() //取得当前日期和时间 格式：yyyy-mm-dd hh:mi:ss
(4) public static String getCurrentChineseDate() //返回 “yyyy年xx月xx日”格式的日期
(5) public static java.util.Date convertToDate(String currentDate) throws Exception //将字符串日期转换为日期类型， 字符串格式为：yyyy-mm-dd, 如果转换失败，抛出转换异常
(6) public static java.util.Date convertToLongDate(String currentDate) throws ConvertException //将日期时间：yyyy-mm-dd hh:mi:ss 转换为日期类型，如果转换失败抛出转换异常。
(7) public static String convertToDateString(java.sql.Date  date) //将日期类型转换为字符串类型，格式：yyyy-mm-dd
(8) public static String convertToDateTimeString(java.sql.Date date) //将日期转换为字符串，格式为：yyyy-mm-dd hh:mi:ss
编写测试类Test，对所有方法进行测试。
**/



public class DateFunction {
		/**
		 * 
		 * @author Administrator 题目1:取得当前日期
		 */
		public static Date getCurrentDate() {
			Date date = Calendar.getInstance().getTime();
			return date;
		}
		 /** 
		 * @return:返回当前年月日格式日期
		 */
		public static String getCurrentShortDate(){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			String str = format.format(getCurrentDate());
			return str;
		}
		/**
		 * 
		 * @return:取得当前日期和时间 格式：yyyy-mm-dd hh:mi:ss
		 */
		public static String getCurrentDateTime(){

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			return format.format(getCurrentDate());
			
		}
		
		/**
		 * 
		 * @return:返回 “yyyy年xx月xx日”格式的日期
		 */
		public static String getCurrentChineseDate(){
			SimpleDateFormat format = new SimpleDateFormat("yyyy年mm月dd日");
			return format.format(getCurrentDate());
			//return c1.get(Calendar.YEAR)+"年"+c1.get(Calendar.MONTH)+"月"+c1.get(Calendar.DAY_OF_MONTH)+"日";
		}
		
		/**
		 * 
		 * @param currentDate:参数列表参数
		 * @return:将字符串日期转换为日期类型， 字符串格式为：yyyy-mm-dd, 如果转换失败，抛出转换异常
		 * @throws ParseException 
		 */
		public static Date convertToDate(String currentDate) throws ParseException{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			//currentDate = "2017-2-4";
			
				return format.parse(currentDate);
		}
		
		/**
		 * 
		 * @param currentDate:参数列表参数
		 * @return:将日期时间：yyyy-mm-dd hh:mi:ss 转换为日期类型，
		 * @throws ParseException :如果转换失败抛出转换异常。
		 */
		public static java.util.Date convertToLongDate(String currentDate) throws ParseException{

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

			//currentDate = "2017-2-4 3:20:40";
			
			
			return format.parse(currentDate);
			
		}
		
		/**
		 * 
		 * @param date:
		 * @return:将日期类型转换为字符串类型，格式：yyyy-mm-dd
		 */
		public static String convertToDateString(java.sql.Date date2){

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			return format.format(date2);
			
		}
		/**
		 * 
		 * @param date
		 * @return:将日期转换为字符串，格式为：yyyy-mm-dd hh:mi:ss
		 */
		public static String convertToDateTimeString(java.sql.Date date2){
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			
			return format.format(date2);
			
		}
		
		
}
