import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int num = (number / 100) * 100;
		
		for (int i = 0; i < 10; i++) {
			int subnum = num + (i * 10);
			
			for (int j = 0; j < 10; j++) {
				int ssubnum = subnum + j;
				
				if (ssubnum % n == 0) {
					sb.append(i).append(j);
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}