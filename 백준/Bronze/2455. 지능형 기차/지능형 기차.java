import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 4;
		StringTokenizer st;
		int pe = 0;
		int max = 0;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int mi = Integer.parseInt(st.nextToken());
			int pl = Integer.parseInt(st.nextToken());
			pe = pe - mi + pl;
			max = Math.max(max, pe);
		}
		
		System.out.println(max);
	}
}