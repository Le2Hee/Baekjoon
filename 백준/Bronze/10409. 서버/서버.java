import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		int count = 0;
		
		while (st.hasMoreElements()) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			
			if (sum <= t) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);
	}
}