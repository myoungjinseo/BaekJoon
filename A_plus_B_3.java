import java.util.Scanner;

public class A_plus_B_3 {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();			//�׽�Ʈ ���̽��� ���� 
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();		//���� A
			int B = sc.nextInt();		//���� B
			System.out.println(A+B); 
		}
	}

}
