import java.util.Scanner;

public class NUM_2438 {		//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Star = "*" ;
		
		for(int i=1; i<N+1; i++) {
		System.out.println(Star);
		Star = Star +"*";		//파이썬에서는 문자열 곱하기 정수형이 되었는데 자바는 모르겠다.
		
		}
	}

}
