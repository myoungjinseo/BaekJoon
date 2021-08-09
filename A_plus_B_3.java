import java.util.Scanner;

public class A_plus_B_3 {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();			//테스트 케이스의 개수 
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();		//변수 A
			int B = sc.nextInt();		//변수 B
			System.out.println(A+B); 
		}
	}

}
