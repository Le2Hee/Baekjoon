import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] com = new boolean[101];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			if (!com[num]) {
				com[num] = true;
			} else {
				count++;
			}
		}
		
		System.out.println(count);
	}
}