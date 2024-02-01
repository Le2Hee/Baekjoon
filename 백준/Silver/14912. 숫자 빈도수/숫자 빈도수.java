import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int[] count = new int[10];

		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);

			for (int j = 0; j < s.length(); j++) {
				count[s.charAt(j) - '0']++;
			}
		}

		sb.append(count[d]);
		System.out.println(sb);
	}
}