import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuffer str = new StringBuffer(br.readLine());
		
		if ((len - n) % 2 == 0) {
			sb.append(str, n - 1, len);
			str = new StringBuffer(str.subSequence(0, n - 1));
			str.reverse();
			sb.append(str);
		} else {
			sb.append(str, n - 1, len).append(str, 0, n - 1);
		}
		
		System.out.println(sb);
	}
}