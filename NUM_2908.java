import java.util.Scanner;

public class NUM_2908 { // ���� ���� �Է½� class �̸��� Main���� �ٲپ��ش�!!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int A1,A2,A3,B1,B2,B3;
		
		A3 = (A - A % 100)/100;			//���� �ڸ� 
		A2 = (A % 100 - A % 10)/10;		//���� �ڸ�
		A1 = A % 10;					//���� �ڸ�
		
		B3 = (B - B % 100)/100;			//���� �ڸ�
		B2 = (B % 100 - B % 10)/10;		//���� �ڸ�	
		B1 = B % 10;					//���� �ڸ�
		
		if(A1*100+A2*10+A3>=B1*100+B2*10+B3) {
			System.out.println(A1*100+A2*10+A3);
		} else {
			System.out.println(B1*100+B2*10+B3);
		}
		
	}

}