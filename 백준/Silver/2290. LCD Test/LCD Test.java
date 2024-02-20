import java.io.*;
import java.util.*;

public class Main {
	
	static int n, h, w;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		char[] str = st.nextToken().toCharArray();
		
		h = 2 * n + 3;
		w = n + 2;
		
		for (int j = 0; j < str.length; j++) {
			sb.append(firstPart(str[j]));
			sb.append(" ");
		}
		sb.append("\n");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str.length; j++) {
				sb.append(secondPart(str[j]));
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < str.length; i++) {
			sb.append(thirdPart(str[i]));
			sb.append(" ");
		}
		sb.append("\n");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str.length; j++) {
				sb.append(fourthPart(str[j]));
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < str.length; i++) {
			sb.append(fifthPart(str[i]));
			sb.append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String firstPart(char c) {
		StringBuilder sb = new StringBuilder();
		
		if (c == '1' || c == '4') {
			for (int i = 0; i < n + 2; i++) {
				sb.append(" ");
			}
		} else {
			sb.append(" ");
			
			for (int i = 0; i < n; i++) {
				sb.append("-");
			}
			
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
	private static String secondPart(char c) {
		StringBuilder sb = new StringBuilder();
		
		if (c == '1' || c == '2' || c == '3' || c == '7') {
			sb.append(" ");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append("|");
		} else if (c == '0' || c == '4' || c == '8' || c == '9') {
			sb.append("|");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append("|");
		} else {
			sb.append("|");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
	private static String thirdPart(char c) {
		StringBuilder sb = new StringBuilder();
		
		if (c == '1' || c == '7' || c == '0') {
			sb.append(" ");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append(" ");
		} else {
			sb.append(" ");
			for (int i = 0; i < n; i++) {
				sb.append("-");
			}
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
	private static String fourthPart(char c) {
		StringBuilder sb = new StringBuilder();
		
		if (c == '1' || c == '3' || c == '4' || c == '5' || c == '9' || c == '7') {
			sb.append(" ");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append("|");
		} else if (c == '2') {
			sb.append("|");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append(" ");
		} else {
			sb.append("|");
			for (int i = 0; i < n; i++) {
				sb.append(" ");
			}
			sb.append("|");
		}
		
		return sb.toString();
	}
	
	private static String fifthPart(char c) {
		StringBuilder sb = new StringBuilder();
		
		if (c == '1' || c == '4' || c == '7') {
			for (int i = 0; i < n + 2; i++) {
				sb.append(" ");
			}
		} else {
			sb.append(" ");
			
			for (int i = 0; i < n; i++) {
				sb.append("-");
			}
			
			sb.append(" ");
		}
		
		return sb.toString();
	}
}
