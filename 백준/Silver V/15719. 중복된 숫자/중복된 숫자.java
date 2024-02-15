import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] count = new int[10000001];
		
		while (st.hasMoreElements()) {
			int num = Integer.parseInt(st.nextToken());
			count[num]++;
			
			if (count[num] > 1) {
				sb.append(num);
				break;
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}
