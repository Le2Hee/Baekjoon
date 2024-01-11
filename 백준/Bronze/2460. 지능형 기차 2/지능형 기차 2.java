import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 10;
		int sum = 0;
		int max = 0;
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int mi = Integer.parseInt(st.nextToken());
			int ad = Integer.parseInt(st.nextToken());
			
			sum -= mi;
			sum += ad;
			max = Math.max(max, sum);
		}
		
		sb.append(max);
		System.out.println(max);
	}
}