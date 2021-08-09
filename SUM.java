import java.util.Scanner;

public class SUM {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		//변수 N
		int SUM =0;			//합
		for(int i=1; i<N+1; i++) {		//i=1~N
			
			SUM+=i;	
		}
		System.out.println(SUM);

	}

}
