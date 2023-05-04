// 확장판 대입연산

public class CalExample02 {

	public static void main(String args[]) {
		
		int x = 10;
		//x = x + 10;
		//x -> 20
		x += 10; // x = x + 10;
		x -= 10; // x = x - 10;
		x *= 10; // x = x * 10;
		x /= 10; // x = x / 10;
		x %= 3; // x = x % 3;
		
		System.out.println(" x = " + x );
		
		// 2. 증감연산
		int y =1;
		y ++; // y = y + 1;
		y --; // y = y - 1;
		++ y; // y = y + 1;
		-- y; // y = y - 1;
		System.out.println(" y = " + y);
	}
}
