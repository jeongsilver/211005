package co.jeongeun.prj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
	private Date date = new Date();
	private Calendar now = Calendar.getInstance();
	//추상클래스이므로 new 연산자로 초기화하지 못하니깐 getInstance로
	private SimpleDateFormat sd;
	
	void dateTest() {
//		sd=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //날짜 표현 형식 정의
//		sd=new SimpleDateFormat("yyyy년 MM월 dd일");
		sd = new SimpleDateFormat("현재시간 hh시 mm분 ss초");
//		date = new Date(); //새로운 날짜 객체를 생성
		
		System.out.println(sd.format(date));
		System.out.println(date);//포맷형식을 주지 않은 date
	
		
	}
	
	void calendarTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(Calendar.YEAR); //calender객체가 갖고 있는 요소값 첫번째
		System.out.println(year+"년");
//		int month = now.get(Calendar.MONTH)+1;
		int month = now.get(Calendar.MONDAY)+1;
		System.out.println(month);
		
	}
}
