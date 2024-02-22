import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[] nums;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			nums = new int[n + 1];
			visit = new boolean[n + 1];
			
			for (int i = 1; i <= n; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			sb.append(search()).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int search() {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (!visit[i]) {
				count++;
				run(i);
			}
		}
		
		return count;
	}
	
	private static void run(int index) {
		if (!visit[index]) {
			visit[index] = true;
			int num = nums[index];
			run(num);
		}
	}
}