import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int n, sum, sub;
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			sum = 0;
			
			for (int i = 2; i <= n; i++) {
				sub = n;
				
				while (true) {
					if (sub % i != 0) {
						break;
					}
					
					sum++;
					sub /= i;
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}