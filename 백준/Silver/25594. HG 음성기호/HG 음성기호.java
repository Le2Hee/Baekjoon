import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		int len;
		String sub;
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < s.length();) {
			len = lencheck(s.charAt(i));
			if (i + len > s.length()) {
				sb.append("ERROR!");
				break;
			}
			
			sub = s.substring(i, i + len);
			if (strcheck(sub)) {
				str.append(s.charAt(i));
				i += len;
			} else {
				sb.append("ERROR!");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("It's HG!\n").append(str.toString());
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int lencheck(char c) {
		if (c == 'o' || c == 'i') {
			return 2;
		} else if (c == 'c' || c == 'l' || c == 't') {
			return 3;
		} else if (c == 'u' || c == 'r' || c == 'n' || c == 'i' || c == 'm' || c == 'j' || c == 'e') {
			return 4;
		} else if (c == 'a' || c == 'd' || c == 'q' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z') {
			return 5;
		} else if (c == 'p' || c == 'k' || c == 'g') {
			return 6;
		} else if (c == 'f' || c == 'h') {
			return 7;
		} else if (c == 'b' || c == 's') {
			return 8;
		}
		
		return -1;
	}
	
	private static boolean strcheck(String s) {
		if (s.equals("aespa")) {
			return true;
		} else if (s.equals("baekjoon")) {
			return true;
		} else if (s.equals("cau")) {
			return true;
		} else if (s.equals("debug")) {
			return true;
		} else if (s.equals("edge")) {
			return true;
		} else if (s.equals("firefox")) {
			return true;
		} else if (s.equals("golang")) {
			return true;
		} else if (s.equals("haegang")) {
			return true;
		} else if (s.equals("iu")) {
			return true;
		} else if (s.equals("java")) {
			return true;
		} else if (s.equals("kotlin")) {
			return true;
		} else if (s.equals("lol")) {
			return true;
		} else if (s.equals("mips")) {
			return true;
		} else if (s.equals("null")) {
			return true;
		} else if (s.equals("os")) {
			return true;
		} else if (s.equals("python")) {
			return true;
		} else if (s.equals("query")) {
			return true;
		} else if (s.equals("roka")) {
			return true;
		} else if (s.equals("solvedac")) {
			return true;
		} else if (s.equals("tod")) {
			return true;
		} else if (s.equals("unix")) {
			return true;
		} else if (s.equals("virus")) {
			return true;
		} else if (s.equals("whale")) {
			return true;
		} else if (s.equals("xcode")) {
			return true;
		} else if (s.equals("yahoo")) {
			return true;
		} else if (s.equals("zebra")) {
			return true;
		}
		
		return false;
	}
}