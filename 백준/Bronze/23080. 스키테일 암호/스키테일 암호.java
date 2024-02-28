import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		
		for (int i = 0; i < str.length; i += n) {
			sb.append(str[i]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}