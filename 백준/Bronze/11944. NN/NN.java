import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean bo = false;
		
		for (int i = 0; i < n; i++) {
			sb.append(n);
			if (sb.length() > m) {
				bo = true;
				break;
			}
		}
		
		if (bo) {
			System.out.println(sb.substring(0, m));
		} else {
			System.out.println(sb);
		}
	}
}