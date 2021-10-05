package co.jeongeun.prj;

public class Exam01 {
	private String str="akcdefg.jsp";
	private String nstr="1234";
	private String mstr="3456";
	private String cstr="20001004"; //yyyymmdd
	
	void stringTest() {
	
		  System.out.println(str.charAt(3)); //
		  System.out.println(str.codePointAt(3)); //아스키코드값 //
		  System.out.println(str.codePointBefore(2));//c 이전의 값을 출력 //
		  System.out.println(str.startsWith("akd")); //
		  System.out.println(str.endsWith(".jsp")); // //
		  System.out.println(nstr.toString()); 
		  System.out.println(nstr+mstr); // //
		  int n=Integer.valueOf(nstr); 
		  int m = Integer.valueOf(mstr); 
		  
		  System.out.println(n+m);  
		  if(str.equals(str))System.out.println(str); //
//		  문자열 비교 == 권장 X // if(str == str )System.out.println(str);
		 
		  String mm = cstr.substring(4,6); 
		  String dd = cstr.substring(6);//6번째부터 끝까지 
		  System.out.println("귀하의 생일은 "+mm+"월"+dd+"일"); //
		 
		

		
		String d = str.substring(0,7);
		if(d.equals("akcdefg"))System.out.println(d);
		
		
		System.out.println(str.replace("k", "B"));
		System.out.println(str.concat("xzy"));
		System.out.println(str.toUpperCase());
		System.out.println(str.getBytes());
		System.out.println(str.indexOf('b'));
		System.out.println(str.trim());//좌우 공백 없애기
		
		
		char c = 'a';
		String cs = String.valueOf('a'); //char type을 String type으로 변환
		String s = "a";
		if(s == cs) System.out.println(cs);
		
	}
}
