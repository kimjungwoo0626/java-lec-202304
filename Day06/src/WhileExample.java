import java.util.Scanner;


public class WhileExample {

	public static void main(String[] args) {
		
		System.out.println("숫자를 1에서부터 몇 까지 출력할까요? :");
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		int startNum = 1;
		
		while(maxNum >= startNum) {
			System.out.print((startNum ++) + "\t");
		}
		
		do {
			System.out.println("최소 한번은 실행합니다.");
			System.out.print((startNum ++) + "\t");
		} while(maxNum >= startNum);
		
		
		
	}
}
