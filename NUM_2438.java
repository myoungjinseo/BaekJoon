import java.util.Scanner;

public class NUM_2438 {		//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Star = "*" ;
		
		for(int i=1; i<N+1; i++) {
		System.out.println(Star);
		Star = Star +"*";		//���̽㿡���� ���ڿ� ���ϱ� �������� �Ǿ��µ� �ڹٴ� �𸣰ڴ�.
		
		}
	}

}
