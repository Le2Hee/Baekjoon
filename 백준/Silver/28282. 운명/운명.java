import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long[] rcount = new long[10001];
		long[] lcount = new long[10001];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < x; i++) {
			int index = Integer.parseInt(st.nextToken());
			rcount[index]++;
		}
		
		for (int i = 0; i < x; i++) {
			int index = Integer.parseInt(st.nextToken());
			lcount[index]++;
		}
		
		long sum = 0;
		
		for (int i = 1; i <= k; i++) {
			sum += (x - lcount[i]) * rcount[i];
		}
		
		System.out.println(sum);
	}
}
