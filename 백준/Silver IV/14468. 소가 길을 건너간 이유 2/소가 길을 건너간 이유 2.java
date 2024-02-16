import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] cow = br.readLine().toCharArray();
		int[] start = new int[26];
		int[] end = new int[26];
		
		for (int i = 0; i < 52; i++) {
			int n = cow[i] - 'A';
			
			if (start[n] == 0) {
				start[n] = i + 1;
			} else {
				end[n] = i + 1;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				if (start[i] < start[j] && start[j] < end[i] && end[i] < end[j]) {
					count++;
				}
			}
		}
		
		bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
	}
}