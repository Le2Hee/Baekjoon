import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] swit = new int[n];
		
		for (int i = 0; i < n; i++) {
			swit[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < m; i++) {
			// 1은 남자, 2는 여자
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if (gender == 1) { // 남자면
				for (int j = num - 1; j < n; j+=num) {
					if (swit[j] == 0) {
						swit[j] = 1;
					} else {
						swit[j] = 0;
					}
				}
			} else { // 여자면
				if (swit[num - 1] == 0) {
					swit[num - 1] = 1;
				} else {
					swit[num - 1] = 0;
				}
				
				for (int j = 1; ;j++) {
					if (num + j - 1 < n && num - j - 1 >= 0 && swit[num - j - 1] == swit[num + j - 1]) {
						if (swit[num - j - 1] == 0) {
							swit[num - j - 1] = 1;
						} else {
							swit[num - j - 1] = 0;
						}
						
						if (swit[num + j - 1] == 0) {
							swit[num + j - 1] = 1;
						} else {
							swit[num + j - 1] = 0;
						}
					} else {
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			sb.append(swit[i]).append(" ");
			
			if ((i + 1) % 20 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}