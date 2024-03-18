import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int count = 0;
		int b, c;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			c = 0;
			for (int j = 0; j < k; j++) {
				b = Integer.parseInt(st.nextToken());
				
				if (b == 0) {
					c++;
				}
			}
			
			if (c < p) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count)); 
		bw.flush();
		bw.close();
		br.close();
	}
}