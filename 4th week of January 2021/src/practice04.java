// BOJ 8958번: OX퀴즈
import java.io.*;
public class practice04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		for(int i = 0; i < N; i++)
			arr[i] = br.readLine();
		for(int i = 0; i < N; i++) {
			int sum = 0, count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O')
					count++;
				else count = 0;
				sum += count;
			}
			System.out.println(sum);
		}
	}
}