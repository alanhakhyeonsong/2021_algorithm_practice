// BOJ 2675번: 문자열 반복
import java.io.*;
import java.util.*;
public class practice04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			String code = st.nextToken();
			for(int j = 0; j < code.length(); j++) {
				for(int k = 0; k < R; k++)
					System.out.print(code.charAt(j));
			}
			System.out.println();
		}
	}
}
