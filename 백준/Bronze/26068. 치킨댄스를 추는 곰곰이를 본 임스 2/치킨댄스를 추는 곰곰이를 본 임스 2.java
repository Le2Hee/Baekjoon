import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine(), "D-");
			int n = Integer.parseInt(st.nextToken());
			if (n <= 90) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}