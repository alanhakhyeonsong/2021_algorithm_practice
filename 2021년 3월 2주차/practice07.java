// BOJ 2908번: 상수
import java.io.*;
import java.util.*;
public class practice07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = new StringBuilder(st.nextToken()).reverse().toString();
		String b = new StringBuilder(st.nextToken()).reverse().toString();
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		System.out.println(Math.max(A, B));
	}
}
