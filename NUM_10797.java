import java.util.Scanner;

public class NUM_10797 {		//���� => class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();		//������ ������ȣ
		int sum =0;			//���� ���� ��
		for(int i=0; i<5; i++) {
			int B=sc.nextInt();		//���� ��ȣ
			if(A==B) {
				sum +=1;	
			}
			
		}
		System.out.println(sum);

	}

}
