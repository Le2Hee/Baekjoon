import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 1;
		
		if (n == 0) {
			count = 0;
		} else {
			int now = 0;
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				int num = Integer.parseInt(st.nextToken());
				
				if (now + num > m) {
					count++;
					now = num;
				} else {
					now += num;
				}
			}
		}
		
		bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
	}
}