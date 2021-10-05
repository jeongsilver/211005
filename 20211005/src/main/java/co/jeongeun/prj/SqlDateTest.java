package co.jeongeun.prj;

import java.sql.Date;//java util은 db.......랑....어려움...

public class SqlDateTest {
	private Date date; //java.sql.Date 객체는 년-월-일 만 처리한다
	
	void sqlDate() {
		date=Date.valueOf("2021-10-05");//스트링 객체를 Date객체로 변환
		System.out.println(date.getTime());
		System.out.println(date.toString());
	}
}
