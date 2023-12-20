import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append("\n");
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			a = (int) Math.pow(a, 2);
			b = (int) Math.pow(b, 2);
			c = (int) Math.pow(c, 2);
			
			int[] arr = {a, b, c};
			Arrays.sort(arr);
			
			if (arr[0] + arr[1] == arr[2]) {
				sb.append("Scenario #").append(i + 1).append(":").append("\n").append("yes").append("\n");
			} else {
				sb.append("Scenario #").append(i + 1).append(":").append("\n").append("no").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}