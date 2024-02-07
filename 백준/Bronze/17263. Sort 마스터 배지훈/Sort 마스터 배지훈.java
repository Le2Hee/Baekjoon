import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			max = Math.max(max, Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(max);
	}
}
