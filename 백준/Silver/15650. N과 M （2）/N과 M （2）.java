import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int n, m;
	static boolean[] visit;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visit = new boolean[n];
		arr = new int[m];
		back(0, 0);
		System.out.println(sb);
	}
	
	private static void back(int start, int depth) {
		if (m == depth) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		for (int i = start; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				back(i + 1, depth + 1);
				visit[i]  = false;
			}
		}
	}
}
