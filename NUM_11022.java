import java.util.Scanner;

public class NUM_11022 {		//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<N+1; i++) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}
	}

}
