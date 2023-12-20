import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		int min = 640000001;
		int max = -1;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				int num = Integer.parseInt(st.nextToken());
				list.add(num);
				min = Math.min(min, num);
				max = Math.max(max, num);
			}
		}
		
		if (max > 256) {
			max = 256;
		}
		
		int time = Integer.MAX_VALUE;
		int hi = 0;
		
		for (int i = min; i <= max; i++) {
			int t = 0;
			int block = b;
			
			for (int j = 0; j < list.size(); j++) {
				if(i < list.get(j)) {
					t += ((list.get(j) - i) * 2);
					block += (list.get(j) - i);
				}else {
					t += (i - list.get(j));
					block -= (i - list.get(j));
				}
			}
			
			if (block < 0) {
				break;
			}
			
			if (time >= t) {
				time = t;
				hi = i;
			}
		}
		
		System.out.println(time + " " + hi);
	}
}