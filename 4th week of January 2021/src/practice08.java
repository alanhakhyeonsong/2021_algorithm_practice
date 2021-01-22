// BOJ 11720번: 숫자의 합
import java.io.*;
public class practice08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.println(sum);
	}
}