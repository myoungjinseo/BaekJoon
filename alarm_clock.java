import java.util.Scanner;

public class alarm_clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();		//�ð�
		int M = sc.nextInt();		//��
		

		if(M>=45) {		//45�� �̻��� ���
			M -= 45;		//45��
			System.out.println(H);
			System.out.println(M);
		}
		else {		//45�� �̸��� ���
			if(H>0) {		//0�� �̻��� ���
				M += 15;		//60-45=15 => �п� 15���� �� ���ش�
				H -= 1;			//�п��� 60���� ������ -1�ð��� �ȴ�
				System.out.println(H);
				System.out.println(M);
			}
			else {			//0���� ���
				H = 23;		//24-1 =23
				M +=15;		//60-45=15 => �п� 15���� �� ���ش�
				System.out.println(H);
				System.out.println(M);
			}
		}
	}

}
