import java.util.Scanner;

public class SUM {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		//���� N
		int SUM =0;			//��
		for(int i=1; i<N+1; i++) {		//i=1~N
			
			SUM+=i;	
		}
		System.out.println(SUM);

	}

}
