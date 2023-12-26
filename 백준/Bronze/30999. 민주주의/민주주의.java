import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = m / 2 + 1;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int co = 0;
			
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'O') {
					co++;
				}
				
				if (co == count) {
					result++;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}