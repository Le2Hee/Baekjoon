import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		char[] str;
		int sum;
		
		while (t-- > 0) {
			str = br.readLine().toCharArray();
			sum = 0;
			
			for (int i = 0; i < 16; i++) {
				if ((i + 1) % 2 == 1) {
					int n = str[i] - '0';
					n *= 2;
					
					if (n >= 10) {
						n %= 10;
						n++;
					}
					
					str[i] = (char)(n + '0');
				}
			}
			
			for (char c : str) {
				sum += (c - '0');
			}
			
			if (sum % 10 == 0) {
				sb.append("T\n");
			} else {
				sb.append("F\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}