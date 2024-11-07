import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 문자열의 길이
		
		char[] js = br.readLine().toCharArray(); // 정훈이의 문자열
		char[] jk = br.readLine().toCharArray(); // 정훈의의 키
		char[] is = br.readLine().toCharArray(); // 이안이의 문자열
		char[] ik = br.readLine().toCharArray(); // 이안이의 키
		
		boolean check = true;
		for (int i = 0; i < n; i++) {
			if (js[i] == is[i]) {
				if (jk[i] != ik[i]) {
					check = false;
					break;
				} else {
					sb.append(ik[i]);
				}
			}
		}
		
		if (!check) {
			sb = new StringBuilder();
			sb.append("htg!");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
