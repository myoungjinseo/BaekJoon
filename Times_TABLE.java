import java.util.Scanner;

public class Times_TABLE {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int result = 0;		//�������� ��
		for(int i=1; i<10; i++) {		//1~9
			result = A *i;		//���� * 1~9
			System.out.println(A+" * "+i+" = "+result);			
		}

	}

}
