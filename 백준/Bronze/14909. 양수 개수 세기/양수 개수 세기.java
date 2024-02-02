import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			if (n > 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}