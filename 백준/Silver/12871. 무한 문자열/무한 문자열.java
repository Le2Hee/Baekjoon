import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String t = br.readLine();
		
		int sLen = s.length();
		int tLen = t.length();
		int len = 0;
		
		if (sLen == tLen) {
			len = sLen;
		} else if (sLen > tLen && sLen % tLen == 0) {
			len = sLen;
		} else if (tLen > sLen && tLen % sLen == 0) {
			len = tLen;
		} else {
			len = sLen * tLen;
		}
		
		StringBuilder sstr = new StringBuilder(s);
		StringBuilder tstr = new StringBuilder(t);
		
		while (sstr.length() < len) {
			sstr.append(s);
		}
		
		while (tstr.length() < len) {
			tstr.append(t);
		}
		
		if (sstr.toString().equals(tstr.toString())) {
			sb.append(1);
		} else {
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}