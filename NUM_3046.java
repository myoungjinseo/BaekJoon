import java.util.Scanner;

public class NUM_3046 {			//���ؿ����� class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int R1 = sc.nextInt();
		int S =sc.nextInt();
		int R2 = 0;
		R2 = 2*S -R1;		//S= (R1+R2)/2�� R1�� ������ ����
		System.out.println(R2);
	}

}