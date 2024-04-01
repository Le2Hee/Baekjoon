import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] a, b;
		int count;
		while (t-- > 0) {
			count = 0;
			
			st = new StringTokenizer(br.readLine());
			int alen = Integer.parseInt(st.nextToken());
			int blen = Integer.parseInt(st.nextToken());
			
			a = new int[alen];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < alen; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			b = new int[blen];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < blen; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			for (int i = 0; i < alen; i++) {
				for (int j = 0; j < blen; j++) {
					if (a[i] <= b[j]) {
						break;
					} else {
						count++;
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}