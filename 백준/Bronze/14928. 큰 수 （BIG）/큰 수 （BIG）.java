import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] str = br.readLine().toCharArray();
		int temp = 0;
		
		for (int i = 0; i < str.length; i++) {
			temp = (temp * 10 + (str[i] - '0')) % 20000303;
		}
		
		bw.write(Integer.toString(temp));
		bw.flush();
		bw.close();
		br.close();
	}
}