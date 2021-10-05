package co.jeongeun.prj;

import java.util.*;

import co.jeongeun.prj.member.Member;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Exam01 ex = new Exam01();
//        ex.stringTest();
//        DateTest date = new DateTest();
//        date.dateTest();
//        date.calendarTest();
//        
//        SqlDateTest sd = new SqlDateTest();
//        sd.sqlDate();
    	Member member;
    	List<Member> members = new ArrayList<Member>();
    	member = new Member("홍길동","대구",13);
    	members.add(member); //리스트에 한명의 데이터를 담겠다
    	member = new Member("강동원","대구",20);
    	members.add(member);
    	member = new Member("신세경","대구",30);
    	members.add(member);
    	
    	for(Member m : members) {
    		m.toString();
    	}
    	
    }
}
