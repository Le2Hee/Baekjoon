import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("#")) {
			char[] str = s.toCharArray();
			
			int count = 0;
			for (int i = 0; i < str.length - 1; i++) {
				if (str[i] == '1') {
					count++;
				}
				sb.append(str[i]);
			}
			
			switch (str[s.length() - 1]) {
			case 'o':
				if (count % 2 == 0) {
					sb.append(1);
				} else {
					sb.append(0);
				}
				break;

			default:
				if (count % 2 == 0) {
					sb.append(0);
				} else {
					sb.append(1);
				}
				break;
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}