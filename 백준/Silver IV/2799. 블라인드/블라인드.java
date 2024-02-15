import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[] count = new int[5];
		String s = br.readLine();
		boolean[] check;
		
		while (h-- > 0) {
			check = new boolean[w];
			
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine(), "#");
				for (int j = 0; j < w; j++) {
					s = st.nextToken();
					
					if (s.equals("....")) {
						if (!check[j]) {
							check[j] = true;
							count[i]++;
						}
					}
				}
			}
			
			for (int i = 0; i < w; i++) {
				if (!check[i]) {
					count[4]++;
				}
			}
			
			s = br.readLine();
		}
		
		for (int n : count) {
			sb.append(n).append(" ");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}