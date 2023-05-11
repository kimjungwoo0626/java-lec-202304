import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1~7 범위내의 숫자를 넣어주세요 : ");
		int dayCode = scan.nextInt();
		
		switch(dayCode) {
		case 1 :
			System.out.println("월요일");
			break;
		case 2 :
			System.out.println("화요일");
			break;
		case 3 :
			System.out.println("수요일");
			break;
		case 4 :
			System.out.println("목요일");
			break;
		case 5 :
			System.out.println("금요일");
			break;
		case 6 :
			System.out.println("토요일");
			break;
		case 7 :
			System.out.println("일요일");
			break;
		default :
			System.out.println("범위는 1 ~7 입니다.");
		
		}
		
		if( dayCode >= 1 && dayCode <= 7 ) {
			System.out.println("범위는 1~7까지");
		} else if ( dayCode == 1); {
			System.out.println("월요일");
		} else if ( dayCode == 2 ) {
			System.out.println("화요일");
		} else if ( dayCode == 3 ) {
			System.out.println("수요일");
		} else if ( dayCode == 4 ) {
			System.out.println("목요일");
		} else if ( dayCode == 5 ) {
			System.out.println("금요일");
		} else if ( dayCode == 6 ) {
			System.out.println("토요일");
		} else if ( dayCode == 7 ) {
			System.out.println("일요일");
		} else {
		System.out.println("종료");
		}
	}
	
}
