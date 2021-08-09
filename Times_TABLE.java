import java.util.Scanner;

public class Times_TABLE {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int result = 0;		//구구단의 값
		for(int i=1; i<10; i++) {		//1~9
			result = A *i;		//변수 * 1~9
			System.out.println(A+" * "+i+" = "+result);			
		}

	}

}
