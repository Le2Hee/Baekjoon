import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int car = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int max = car;
		
		for (int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			int in = Integer.parseInt(st.nextToken());
			int out = Integer.parseInt(st.nextToken());
			
			car += in - out;
			max = Math.max(max, car);
			
			if (car < 0) {
				max = 0;
				break;
			}
		}
		
		System.out.println(max);
	}
}