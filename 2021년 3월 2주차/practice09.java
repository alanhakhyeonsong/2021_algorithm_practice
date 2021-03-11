// BOJ 2941번: 크로아티아 알파벳
import java.io.*;
public class practice09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(int i = 0; i < arr.length; i++)
			str = str.replace(arr[i], "a");
		System.out.println(str.length());
	}
}