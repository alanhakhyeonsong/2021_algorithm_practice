// BOJ 1157번: 단어 공부
import java.io.*;
public class practice05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
				arr[str.charAt(i)-'A']++;
		}
		int max = -1;
		char ch = '?';
		for(int i = 0; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max)
				ch = '?';
		}
		System.out.println(ch);
	}
}
