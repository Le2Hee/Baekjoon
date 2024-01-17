import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		Arrays.sort(numbers);
		
		String str = br.readLine();
		for (int i = 0; i < 3; i++) {
			if (str.charAt(i) == 'A') {
				sb.append(numbers[0]).append(" ");
			} else if (str.charAt(i) == 'B') {
				sb.append(numbers[1]).append(" ");
			} else {
				sb.append(numbers[2]).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}