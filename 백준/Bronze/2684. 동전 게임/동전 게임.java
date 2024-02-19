import java.io.*;
import java.util.*;

public class Main {
	
	static String[] key = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String s;
		int[] count;
		
		while (t-- > 0) {
			count = new int[8];
			s = br.readLine();
			
			for (int i = 3; i <= 40; i++) {
				count[search(s.substring(i - 3, i))]++;
			}
			
			for (int n : count) {
				sb.append(n).append(" ");
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int search(String s) {
		for (int i = 0; i < 8; i++) {
			if (s.equals(key[i])) {
				return i;
			}
		}
		
		return -1;
	}
}