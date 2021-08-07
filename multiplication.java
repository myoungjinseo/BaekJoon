import java.util.Scanner;

public class multiplication {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));		//472*5(일의 자리수)
		System.out.println(A*((B%100)-B%10)/10);		//472*8(십의 자리수)	
		System.out.println(A*(B-B%100)/100);		//472*3(백의 자리수)
		System.out.println(A*(B%10)+A*((B%100)-B%10)+A*(B-B%100));
	}

}
