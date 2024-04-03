import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		
		int zero = 0;
		int one = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				one++;
			} else {
				zero++;
			}
		}
		
		zero /= 2;
		one /= 2;
		
		for (int i = 0; i < zero; i++) {
			sb.append("0");
		}
		
		for (int i = 0; i < one; i++) {
			sb.append("1");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}