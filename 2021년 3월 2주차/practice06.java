// BOJ 1152: 단어의 개수
import java.io.*;
import java.util.*;
public class practice06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.println(st.countTokens());
	}
}
