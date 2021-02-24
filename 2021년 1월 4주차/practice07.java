// BOJ 10809번: 알파벳 찾기
import java.util.*;
public class practice07 {
	public static void main(String[] args) {
		int[] result = new int[26];
		for(int i = 0; i < result.length; i++)
			result[i] = -1;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			int b = (int)a;
			if(result[b-97] != -1) {
				continue;
			} else {
				result[b-97] = i;
			}
		}
		
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}
