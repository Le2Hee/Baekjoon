import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int ax = a % 4 == 0 ? a / 4 : a / 4 + 1;
		int bx = b % 4 == 0 ? b / 4 : b / 4 + 1;
		int ay = func(a);
		int by = func(b);
		int result = Math.abs(bx - ax) + Math.abs(by - ay);
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int func(int num) {
		if (num % 4 == 0) {
			return 4;
		}
		
		return num % 4;
	}
}