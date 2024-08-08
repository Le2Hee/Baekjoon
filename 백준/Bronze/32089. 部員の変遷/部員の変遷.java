import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s;
		
		int num, sum, max;
		int[] arr;
		StringTokenizer st;
		while (!(s = br.readLine()).equals("0")) {
			num = Integer.parseInt(s);
			arr = new int[num];
			max = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < num - 2; i++) {
				sum = arr[i] + arr[i + 1] + arr[i + 2];
				max = Math.max(max, sum);
			}
			
			sb.append(max).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
