import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		double strategyCutline = 35 * 0.3;
		double itManagementCutline = 25 * 0.3;
		double skillCutline = 40 * 0.3;
		
		int num, str, itm, ski, sum;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			str = Integer.parseInt(st.nextToken());
			itm = Integer.parseInt(st.nextToken());
			ski = Integer.parseInt(st.nextToken());
			sum = str + itm + ski;
			
			sb.append(num).append(" ").append(sum).append(" ");
			
			if (sum >= 55) {
				if (str >= strategyCutline && itm >= itManagementCutline && ski >= skillCutline) {
					sb.append("PASS\n");
				} else {
					sb.append("FAIL\n");
				}
			} else {
				sb.append("FAIL\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}