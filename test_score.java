import java.util.Scanner;

public class test_score {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A>=90) {
			System.out.println("A");		//90�̻�	
		}
		else if(A>=80) {
			System.out.println("B");		//90�̸� 80�̻�		}
		}
		else if(A>=70) {
			System.out.println("C");		//80�̸� 70�̻�
		}
		else if(A>=60) {
			System.out.println("D");		//70�̸� 60�̻�
		}
		else {
			System.out.println("F");		//60�̸�
		}

	}

}
