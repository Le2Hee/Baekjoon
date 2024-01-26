import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[c + 1];
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			for (int i = num; i <= c; i += num) {
				check[i] = true;
			}
		}
		
		int count = 0;
		
		for (boolean bo : check) {
			if (bo) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}