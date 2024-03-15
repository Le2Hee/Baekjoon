import java.io.*;
import java.util.*;

public class Main {
	
	static int[] note;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int n, m, num;
		StringTokenizer st;
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			note = new int[n];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < n; i++) {
				note[i] = Integer.parseInt(st.nextToken());
			}
			
			m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			Arrays.sort(note);
			while (m-- > 0) {
				num = Integer.parseInt(st.nextToken());
				
				if (func(num, 0, n - 1)) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				
				sb.append("\n");
			}
		}
		
		bw.write(sb.toString()); 
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean func(int key, int row, int high) {
		int mid;
		
		if (row <= high) {
			mid = (row + high) / 2;
			
			if (key == note[mid]) {
				return true;
			} else if(key < note[mid]) {
				return func(key, row, mid - 1);
			} else {
				return func(key, mid + 1, high);
			}
		}
		
		return false;
	}
}
