import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int num;
		for (int i = 0; i < 3; i++) {
			num = Integer.parseInt(br.readLine());
			sb.append(LSB4(Integer.toBinaryString(num)));
		}
		
		String str = String.valueOf(Integer.parseInt(sb.toString(), 2));
		
		sb = new StringBuilder();
		if (str.length() < 4) {
			int count = 4 - str.length();
			
			while (count-- > 0) {
				sb.append("0");
			}
			
			sb.append(str);
		} else {
			sb.append(str);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String LSB4 (String s) {
		String result = "";
		
		if (s.length() >= 4) {
			result = s.substring(s.length() - 4, s.length());
		} else {
			int count = 4 - s.length();
			
			while (count-- > 0) {
				result += "0";
			}
			
			result += s;
		}
		
		return result;
	}
}