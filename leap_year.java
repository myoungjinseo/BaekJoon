import java.util.Scanner;

public class leap_year {		//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A%4 == 0) {			//4�� ��� O
			if(A%100 != 0 || A%400 == 0) {			//100�� ��� X or 400�� ��� O 
				System.out.println("1");	// ������ ���
			}
			else {
				System.out.println("0");		// ������ �ƴ� ���(100�� ��� X or 400�� ��� O  ����X)
		}}
		else {
			System.out.println("0");			//������ �ƴ� ���(4�� ��� O ����X)
		}
	

}}
