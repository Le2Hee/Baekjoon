import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> list;
	static int n, k, p;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		int count = 0;
		
		list = new LinkedList<>();
		int b;
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			b = Integer.parseInt(st.nextToken());
			
			list.add(b);
			
			if (list.size() == k) {
				if (check()) {
					count++;
				}
				
				list = new LinkedList<>();
			}
		}
		
		bw.write(Integer.toString(count)); 
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check() {
		boolean result = true;
		int c = k;
		
		for (int i = 0; i < k; i++) {
			if (list.get(i) == 0) {
				c--;
			}
			
			if (c < p) {
				result = false;
				break;
			}
		}
		
		return result;
	}
}