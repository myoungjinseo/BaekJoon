import java.util.Scanner;

public class NUM_5543 {		//���ؿ����� class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger1 = sc.nextInt();		//�������
		int burger2	= sc.nextInt();		//�ߴ����� 	
		int burger3	= sc.nextInt();		//�ϴ�����
		int coke = sc.nextInt();
		int soda = sc.nextInt();
		//S = �����ؾ� �� �ݾ�
		int S = Math.min(burger3,Math.min(burger1, burger2))+Math.min(soda, coke)-50;
		System.out.println(S);
	}

}
