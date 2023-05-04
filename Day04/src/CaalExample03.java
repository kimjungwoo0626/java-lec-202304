// 비교연산
public class CaalExample03 {

	public static void main(String args[]) {
		
		// 같다, 작다, 크다. 작거나 같다. 크거나 같다, 같지 않다.
		// A = B (인간) -> A == B
		// A < B , A > B , A <= B, A >= B
		// A != B !는 not을 의미합니다. != -> not equal
		//비교연산은 2항 
		// ( 값 비교연산자 값, 값 비교연산자 연산식, 연상식 비교연산자 연산식)

		int x = 10;
		int y = 20;
		int z = 3;
		
		boolean result = x >= y;
		boolean result2 = 10 == (x * 2 / y);
		boolean result3 = 10 != 1;
		
		System.out.println( x +" >= " + y + " = " + (x >= y));
		System.out.println (x +" >= " + y + " = " + (result));	
		System.out.println ("result2 = " + result2);
		System.out.println ("result3 = " + result3);
		
		
		
		// x는 2이상, 20미만dls rkqt
		// 2 <= x < 20 <- 인간은 계산가능
		//boolean result4 = 2 <= x < 20; <- 에러가 난다
		// 논리연산으로 위의 식을 대체한다
		boolean result4 = 2 <= x && x < 20;
		boolean result5 = x > 10 && y <= 20 && y > x; 
		// false && true && true = false
		boolean result6 = x > 10 || y <= 20 || y > x;
		// false || true || true = true
		boolean result7 = x >10 ^ y <= 20 ^ y > x;
		// false ^true ^true = false
		boolean result8 = result5 ^ result6 || result7 && true;
		
		System.out.println ("result4 = " + result4);
		System.out.println ("result5 = " + result5);
		System.out.println ("result6 = " + result6);
		System.out.println ("result7 = " + result7);
		System.out.println ("result8 = " + result8);
		
	}

}
