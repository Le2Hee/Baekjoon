import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException { // ○
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		
		int count = 0, sub = 0;
		for (int i = 1; i < m - 1; i++) {
			if (s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I') {
				sub++;
				
				if (sub == n) {
					count++;
					sub--;
				}
				
				i++;
			} else {
				sub = 0;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
