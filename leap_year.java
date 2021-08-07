import java.util.Scanner;

public class leap_year {		//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A%4 == 0) {			//4의 배수 O
			if(A%100 != 0 || A%400 == 0) {			//100의 배수 X or 400의 배수 O 
				System.out.println("1");	// 윤년인 경우
			}
			else {
				System.out.println("0");		// 윤년이 아닌 경우(100의 배수 X or 400의 배수 O  성립X)
		}}
		else {
			System.out.println("0");			//윤년이 아닌 경우(4의 배수 O 성립X)
		}
	

}}
