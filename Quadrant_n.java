import java.util.Scanner;

public class Quadrant_n {			//���� ���� �� class �̸��� Main���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();		//x��ǥ
		int Y = sc.nextInt();		//y��ǥ
		
		if(X>0) {
			if(Y>0) {		//x>0 and y>0 1��и�
				System.out.println("1");
			}
			else {			//x>0 and y<0 4��и�
				System.out.println("4");
			}
		}
		else {
			if(Y>0) {		//x<0 and y>0 2��и�
				System.out.println("2");
			}
			else {			//x<0 and y<0 3��и�
				System.out.println("3");
			}
					
			}
		}
	}


