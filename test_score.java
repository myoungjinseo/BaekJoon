import java.util.Scanner;

public class test_score {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A>=90) {
			System.out.println("A");		//90이상	
		}
		else if(A>=80) {
			System.out.println("B");		//90미만 80이상		}
		}
		else if(A>=70) {
			System.out.println("C");		//80미만 70이상
		}
		else if(A>=60) {
			System.out.println("D");		//70미만 60이상
		}
		else {
			System.out.println("F");		//60미만
		}

	}

}
