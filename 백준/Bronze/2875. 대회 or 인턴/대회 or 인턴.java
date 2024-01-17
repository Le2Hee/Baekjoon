import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int max = -1;
		
		for (int i = 0; i <= k; i++) {
			int nw = w - i;
			int nm = m - (k - i);
			
			if (nw / 2 < nm) {
				max = Math.max(nw / 2, max);
			} else {
				max = Math.max(nm, max);
			}
		}
		
		System.out.println(max);
    }
}