import java.io.*;
import java.util.*;

public class Main {
	
	static int count = 0, k, n;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		char[] arr = br.readLine().toCharArray();
		visit = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'P') {
				visit[i] = true;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (visit[i] && arr[i] == 'P') {
				search(i);
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search(int index) {
		boolean ch = false;
		
		for (int i = k; i > 0; i--) {
			if (check(index - i) && !visit[index - i]) {
				visit[index - i] = true;
				count++;
				ch = true;
				break;
			}
		}
		
		if (!ch) {
			for (int i = 1; i <= k; i++) {
				if (check(index + i) && !visit[index + i]) {
					visit[index + i] = true;
					count++;
					break;
				}
			}
		}
	}
	
	private static boolean check(int index) {
		return index >= 0 && index < n;
	}
}