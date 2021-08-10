import java.util.Scanner;

public class NUM_10952 {		//백준 제출 시 class 이름을 Main으로 설정


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(true) {
			int A = sc.nextInt();		
			int B = sc.nextInt();
			
			if(A == 0 && B ==0) {
				break;
			}
			System.out.println(A+B);
		}
	}

}
