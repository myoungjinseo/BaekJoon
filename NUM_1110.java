import java.util.Scanner;

public class NUM_1110 {			//백준 제출 시 class 이름을 Main으로 설정


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();		//변수 A
		int B = A;		//A 첫번째 값
		int sum = 0;		//더하기 값
		int i = 0;
		while (true) {

			if (A < 10) {
				sum = A;		//10보다 작을 시 십의 자리수 0 더하기 일의 자리수값
			} else {
				sum = A % 10 + (A - A % 10) / 10;	// A%10 = 일의 자리 (A -A%10)/10 십의자리
			}
			
			if (sum >= 10) {		//sum의 값은 10을 넘으면 안됨 => 일의 자리 수이므로
				sum -= 10;
			}
			A = (A % 10) * 10 + sum;	// A의 일의 자리수 => 십의 자리 , sum =일의 자리
			
			i += 1;		
			if (A == B) {		//A 변수 = B(A초기 값)이 같을 시 멈춤
				break;
			}
			
		}
		System.out.println(i ); 	//횟수
	}
}
