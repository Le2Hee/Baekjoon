import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int[] cow = new int[11];
		
		for (int i = 1; i < 11; i++) {
			cow[i] = 2;
		}
		
		int count = 0;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if (cow[c] == 2) {
				cow[c] = r;
			} else if (cow[c] != r) {
				count++;
				cow[c] = r;
			}
		}
		
		System.out.println(count);
	}
}
