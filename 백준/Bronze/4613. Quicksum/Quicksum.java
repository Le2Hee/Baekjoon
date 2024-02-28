import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		char[] arr;
		int sum;
		while (!(s = br.readLine()).equals("#")) {
			arr = s.toCharArray();
			sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != ' ') {
					int num = i + 1;
					int alnum = arr[i] - 'A' + 1;
					sum += num * alnum;
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}