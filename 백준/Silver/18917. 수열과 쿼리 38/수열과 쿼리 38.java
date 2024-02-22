import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		long sum = 0;
		long xor = 0;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int x;
			
			switch (num) {
			case 1 :
				x = Integer.parseInt(st.nextToken());
				sum += x;
				xor ^= x;
				break;
			case 2 :
				x = Integer.parseInt(st.nextToken());
				sum -= x;
				xor ^= x;
				break;
			case 3 :
				sb.append(sum).append("\n");
				break;
			case 4 :
				sb.append(xor).append("\n");
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}