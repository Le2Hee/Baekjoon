import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		TreeSet<Integer> tree;
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			tree = new TreeSet<>();
			int m = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] numbers = new int[m];
			
			for (int i = 0; i < m; i++) {
				numbers[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum;
			
			for (int i = 0; i < m; i++) {
				sum = 0;
				for (int j = i; j < m; j++) {
					sum += numbers[j];
					tree.add(sum);
				}
			}
			
			sb.append(tree.last()).append("\n");
		}
		
		System.out.println(sb);
	}
}