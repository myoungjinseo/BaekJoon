import java.util.Scanner;

public class NUM_1110 {			//���� ���� �� class �̸��� Main���� ����


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();		//���� A
		int B = A;		//A ù��° ��
		int sum = 0;		//���ϱ� ��
		int i = 0;
		while (true) {

			if (A < 10) {
				sum = A;		//10���� ���� �� ���� �ڸ��� 0 ���ϱ� ���� �ڸ�����
			} else {
				sum = A % 10 + (A - A % 10) / 10;	// A%10 = ���� �ڸ� (A -A%10)/10 �����ڸ�
			}
			
			if (sum >= 10) {		//sum�� ���� 10�� ������ �ȵ� => ���� �ڸ� ���̹Ƿ�
				sum -= 10;
			}
			A = (A % 10) * 10 + sum;	// A�� ���� �ڸ��� => ���� �ڸ� , sum =���� �ڸ�
			
			i += 1;		
			if (A == B) {		//A ���� = B(A�ʱ� ��)�� ���� �� ����
				break;
			}
			
		}
		System.out.println(i ); 	//Ƚ��
	}
}
