import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		char[] arr, key;
		while (t-- > 0) {
			arr = br.readLine().toCharArray();
			key = br.readLine().toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != ' ') {
					sb.append(key[arr[i] - 'A']);
				} else {
					sb.append(arr[i]);
				}
			}
			
			sb.append("\n");
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
