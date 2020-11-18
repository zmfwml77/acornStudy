package test.main;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 *  이렇게 크기에 따라 나누는 이유는 데이터를 좀 더 효율적으로 관리하기 위해
 */
public class MainClass01 {
	// run했을 때 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//정수형 변수 선언하고 값 대입하기
		byte a=10;
		short b=10;
		int c=10;
		long d=10;
		
		//실수형 변수 선언하고 값 대입하기
		float e=10.1f;
		double f=10.1d;
		double g=10.1;
		/*float 타입을 만들 땐 value 뒤에 f를 붙여줘야함 
		 * double은 d를 안 붙여도 된다. 여기서 아무것도 붙여주지 않으면 double로 간주됨*/		
	}
}