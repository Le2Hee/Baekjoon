import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while ((s = br.readLine()) != null) {
			char[] arr = s.toCharArray();
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'i') {
					sb.append("e");
				} else if (arr[i] == 'e') {
					sb.append("i");
				} else if (arr[i] == 'I') {
					sb.append("E");
				} else if (arr[i] == 'E') {
					sb.append("I");
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
