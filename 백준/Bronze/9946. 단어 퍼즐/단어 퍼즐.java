import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a = "";
		String b = "";
		int[] dropCount, pickUpCount;
		int count = 0;
		
		while (!(a = br.readLine()).equals("END")) {
			b = br.readLine();
			count++;
			
			dropCount = new int[26];
			pickUpCount = new int[26];
			
			for (int i = 0; i < a.length(); i++) {
				dropCount[a.charAt(i) - 'a']++;
			}
			
			for (int i = 0; i < b.length(); i++) {
				pickUpCount[b.charAt(i) - 'a']++;
			}
			
			boolean check = true;
			for (int i = 0; i < 26; i++) {
				if (dropCount[i] != pickUpCount[i]) {
					check = !check;
					break;
				}
			}
			
			sb.append("Case ").append(count).append(": ");
			if (check) {
				sb.append("same\n");
			} else {
				sb.append("different\n");
			}
		}
		br.readLine();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}