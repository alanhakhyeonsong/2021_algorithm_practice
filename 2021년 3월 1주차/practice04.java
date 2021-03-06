// BOJ 11399번: ATM
import java.util.*;
import java.io.*;
public class practice04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] atm = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			atm[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(atm);
		int result = 0;
		int sum = 0;
		for(int time : atm) {
			sum = sum + time;
			result += sum;
		}
		System.out.println(result);
	}
}
