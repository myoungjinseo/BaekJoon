import java.util.Scanner;

public class Quadrant_n {			//백준 제출 시 class 이름을 Main으로 설정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();		//x좌표
		int Y = sc.nextInt();		//y좌표
		
		if(X>0) {
			if(Y>0) {		//x>0 and y>0 1사분면
				System.out.println("1");
			}
			else {			//x>0 and y<0 4사분면
				System.out.println("4");
			}
		}
		else {
			if(Y>0) {		//x<0 and y>0 2사분면
				System.out.println("2");
			}
			else {			//x<0 and y<0 3사분면
				System.out.println("3");
			}
					
			}
		}
	}


