import java.util.Scanner;

public class NUM_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int result =0;
		// if���� ���� ���簢���� 4������
		if(w-x<x && h-y<y) {		//1��и�
			if(w-x<h-y) {		
				result = w-x;
			} else {
				result = h-y;
			}			
		}else if(w-x>=x && h-y<y){		//2��и�
			if(x<h-y) {
				result =x;
			}else {
				result=h-y;
			}
		}else if(w-x>=x && h-y>=y) {	//3��и�
			if(x<y) {
				result =x;
			}else {
				result=y;
			}
		}else if(w-x<x && h-y>=y) {		//4��и�
			if(w-x<y) {
				result =w-x;
			}else {
				result=y;
			}
		}
			
		
		System.out.println(result);
	}
	}

