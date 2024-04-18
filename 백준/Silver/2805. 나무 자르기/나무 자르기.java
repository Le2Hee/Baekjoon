import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int result = 0;
		st = new StringTokenizer(br.readLine());
		
		int[] tree = new int[n];
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(tree);
		int max = tree[n - 1] - 1;
		
		int sum;
		for (int i = max; i >= 0; i--) {
			sum = 0;
			
			for (int j = n - 1; j >= 0; j--) {
				if (i >= tree[j]) {
					break;
				} else {
					sum += tree[j] - i;
				}
			}
			
			if (sum >= m) {
				result = i;
				break;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}