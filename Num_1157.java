import java.util.Scanner;

public class Num_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();	//�빮�� �Է¹ޱ�

        int[] cnt = new int[26];	//���ĺ� ������ŭ �迭
        int max = -1;
        char result = '?';
        
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 65]++; //cnt[str.charAt(i) - 65] += 0
         
          //a�� �ƽ�Ű�ڵ� int�� = 65
            if (max < cnt[str.charAt(i) - 65]) {	 //ó���� ������ ����, �ι�°���ʹ� �񱳴�� 		
                max = cnt[str.charAt(i) - 65];		//max �� ����
                result = str.charAt(i);		//result �� �Է�  , �˹���
            } else if (max == cnt[str.charAt(i) - 65]) {
                result = '?';
            }

        }
        System.out.println(result);

        
        
    }
}