import java.util.Scanner;

public class multiplication {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));		//472*5(���� �ڸ���)
		System.out.println(A*((B%100)-B%10)/10);		//472*8(���� �ڸ���)	
		System.out.println(A*(B-B%100)/100);		//472*3(���� �ڸ���)
		System.out.println(A*(B%10)+A*((B%100)-B%10)+A*(B-B%100));
	}

}
