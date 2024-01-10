import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		if (n == 1) {
			sb.append("권병장님, 중대장님이 찾으십니다");
		} else {
			int[] members = new int[n];
			int[] sum = new int[n];
			
			for (int i = 0; i < n; i++) {
				members[i] = Integer.parseInt(st.nextToken());
				sum[i] = members[i];
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n - 1; i++) {
				sum[i] += Integer.parseInt(st.nextToken());
			}
			
			boolean bo = false;
			int index = n - 1;
			
			for (int i = 0; i < n - 1; i++) {
				if (sum[i] >= sum[index]) {
					bo = !bo;
					index = i;
					break;
				}
			}
			
			if (!bo) {
				sb.append("엄마 나 전역 늦어질 것 같아");
			} else {
				while (bo) {
					int sub = index;
					
					for (int i = 0; i < index; i++) {
						if (sum[i] >= members[sub]) {
							index = i;
							break;
						}
					}
					
					if (index == 0) {
						bo = !bo;
					} else if (sub == index) {
						break;
					}
				}
				
				if (!bo) {
					sb.append("권병장님, 중대장님이 찾으십니다");
				} else {
					sb.append("엄마 나 전역 늦어질 것 같아");
				}
			}
		}
		
		System.out.println(sb);
	}
}