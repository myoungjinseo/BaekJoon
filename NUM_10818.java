import java.util.Scanner;

public class NUM_10818 {		//���� ���� �Է½� class �̸��� Main���� �ٲپ��ش�!!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int [] arr = new int [A];
        int max =-1000001;        // ��� ����� ���� ���� ���� ���� �� ����    
		int min = 1000001;        // ��� ����� ���� ���� ���� ū �� ����
		for (int i = 0; i <arr.length; i++) {
			arr [i] = sc.nextInt();
			
			if(arr [i]<min) {			//�ּڰ��� ���� ��
				min = arr [i];
			}  
            if(arr [i]>max){	// �ִ��� ���� ��
				max = arr [i];	
			}
			
		}

		System.out.println(min+" "+max);
		
	}

}
