import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		boolean[] time = new boolean[1440];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int startM = start % 100 + ((start / 100) * 60) - 10;
			int endM = end % 100 + ((end / 100) * 60) + 10;
			
			for (int j = startM; j < endM; j++) {
				time[j] = true;
			}
		}
		
		int count = 0;
		int max = 0;
		
		for (int i = 600; i < 1320; i++) {
			if (!time[i]) {
				count++;
			} else {
				max = Math.max(count, max);
				count = 0;
			}
		}
		
		if (count != 0) {
			max = Math.max(count, max);
		}
		
		System.out.println(max);
	}
}