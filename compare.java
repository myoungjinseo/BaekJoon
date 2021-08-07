import java.util.Scanner;

public class compare {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");		
		}
		else if(A<B) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	}

}
