import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		String[] setting = encryption();
		
		String s1, s2;
		int sum;
		while (t-- > 0) {
			s1 = br.readLine();
			s2 = br.readLine();
			sum = decoding(s1) + decoding(s2);
			sb.append(setting[sum]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int decoding(String s) {
		int num = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '}') {
				num++;
			} else {
				break;
			}
		}
		
		return num - 1;
	}
	
	private static String[] encryption() {
		StringBuilder sb = new StringBuilder();
		String[] str = new String[16];
		str[0] = "{}";
		str[1] = "{{}}";
		
		for (int i = 2; i < 16; i++) {
			sb = new StringBuilder();
			sb.append("{");
			
			for (int j = 0; j < i; j++) {
				sb.append(str[j]);
				
				if (j < i - 1) {
					sb.append(",");
				}
			}
			
			sb.append("}");
			str[i] = sb.toString();
		}
		
		return str;
	}
}