import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = solution(n);
		
		bw.write(Integer.toString(num));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int solution(int num) {
		int be = 2;
		
		for (int i = 3; ; i++) {
			if (check(i)) {
				if (be * i > num) {
					return be * i;
				} else {
					be = i;
				}
			}
		}
	}
	
	private static boolean check(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}