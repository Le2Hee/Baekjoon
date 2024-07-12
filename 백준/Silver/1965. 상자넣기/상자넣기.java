import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[] boxes, count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boxes = new int[n];
		for (int i = 0; i < n; i++) {
			boxes[i] = Integer.parseInt(st.nextToken());
		}
		
		count = new int[n];
		count[0] = 1;
		
		for (int i = 1; i < n; i++) {
			count[i] = search(i) + 1;
		}
		
		int result = 0;
		for (int num : count) {
			result = Math.max(result, num);
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int search(int index) {
		int max = 0;
		
		for (int i = index - 1; i >= 0; i--) {
			if (boxes[i] < boxes[index]) {
				max = Math.max(max, count[i]);
			}
		}
		
		return max;
	}
}