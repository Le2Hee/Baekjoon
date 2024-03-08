import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		String name;
		char[] arr;
		while (t-- > 0) {
			name = br.readLine();
			arr = name.toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'S') {
					sb.append(name);
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}