import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 정사각형의 개수
		int result = n; // 직사각형의 개수
		
		for (int i = 2; i <= n; i++) { // 세로 길이
			for (int j = i; j <= n; j++) { // 가로 길이
				if (j * i > n) {
					break;
				}
				
				result++;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}