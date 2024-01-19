import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); // 시작온도
		int b = Integer.parseInt(br.readLine()); // 목표온도
		int c = Integer.parseInt(br.readLine()); // 얼고 1도 올리는 시간
		int d = Integer.parseInt(br.readLine()); // 얼고 해동
		int e = Integer.parseInt(br.readLine()); // 안얼고 1도 올리는 시간
		int sum = 0;
		
		while (a != b) {
			if (a < 0) {
				sum += Math.abs(a * c);
				a = 0;
			}
			
			if (a == 0) {
				sum += d;
			}
			
			sum += (b - a) * e;
			a = b;
		}
	
		System.out.println(sum);
	}
}