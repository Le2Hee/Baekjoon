import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int a, b;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			int[] minMaxNum = minMax(a, b);
			sb.append(minMaxNum[0]).append(" ").append(minMaxNum[1]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int[] minMax (int a, int b) {
		int min = 1;
		int max = 1;
		
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		
		boolean run = true;
		while (run) {
			for (int i = 2; i <= Math.min(result[0], result[1]); i++) {
				if (result[0] % i == 0 && result[1] % i == 0) {
					min *= i;
					max *= i;
					result[0] /= i;
					result[1] /= i;
					break;
				} else if (i == Math.min(result[0], result[1])) {
					run = false;
				}
			}
			
			if (result[0] == 1 || result[1] == 1) {
				break;
			}
		}
		
		max *= result[0];
		max *= result[1];
		
		result[0] = max;
		result[1] = min;
		
		return result;
	}
}