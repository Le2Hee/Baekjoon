import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			int[] x = new int[4];
			int[] y = new int[4];
			
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				x[i] = Integer.parseInt(st.nextToken());
				y[i] = Integer.parseInt(st.nextToken());
			}
			
			List<Double> list = new LinkedList<>();
			double min = Integer.MAX_VALUE;
			double max = Integer.MIN_VALUE;
			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j < 4; j++) {
					double o = Math.pow(x[i] - x[j], 2);
					double t = Math.pow(y[i] - y[j], 2);
					min = Math.min(min, o + t);
					max = Math.max(max, o + t);
					list.add(o + t);
				}
			}
			
			int minCount = 0;
			int maxCount = 0;
			
			for (double d : list) {
				if (d == min) {
					minCount++;
				} else if (d == max) {
					maxCount++;
				}
			}
			
			if (minCount == 4 && maxCount == 2) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}