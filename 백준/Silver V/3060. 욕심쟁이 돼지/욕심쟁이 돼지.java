import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int n, num[], sum;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			num = new int[6];
			sum = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				sum += num[i];
			}
			
			if (sum > n) {
				sb.append(1).append("\n");
				continue;
			}
			
			for (int i = 1; ; i++) {
				sum *= 4;
				
				if (sum > n) {
					sb.append(i + 1).append("\n");
					break;
				}
			}
		}
		
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}
