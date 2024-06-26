import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 
		int n = Integer.parseInt(br.readLine()); // 기록 수
		
		String name;
		while (n-- > 0) {
			name = br.readLine();
			
			for (int i = 0; i < name.length(); i++) {
				if (Character.isUpperCase(name.charAt(i))) {
					sb.append(Character.toLowerCase(name.charAt(i)));
				} else {
					sb.append(name.charAt(i));
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