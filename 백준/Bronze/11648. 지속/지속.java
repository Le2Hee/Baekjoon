import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] str = br.readLine().toCharArray();
		int sum;
		int count = 0;
		
		while (str.length > 1) {
			count++;
			sum = 1;
			
			for (int i = 0; i < str.length; i++) {
				int n = str[i] - '0';
				sum *= n;
			}
			
			str = String.valueOf(sum).toCharArray();
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}