import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("0")) {
			char[] arr = s.toCharArray();
			int num = Integer.parseInt(s);
			
			sb.append(num).append(" ");
			while (true) {
				int sub = 1;
				
				for (int i = 0; i < arr.length; i++) {
					sub *= arr[i] - '0';
				}
				
				if (sub == num) {
					break;
				} else {
					sb.append(sub).append(" ");
					num = sub;
					arr = String.valueOf(sub).toCharArray();
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