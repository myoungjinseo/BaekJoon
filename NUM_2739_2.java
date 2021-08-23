import java.util.Scanner;

public class NUM_2739_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][9];
		int result = 0;
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 9; i++) {
				arr[0][i] = j+2;
				arr[1][i] = i + 1;
				result = arr[0][i] * arr[1][i];
				System.out.println(arr[0][i] + " * " + arr[1][i] + " = " + result);
			}
		}

	}

}
