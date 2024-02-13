import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int price = Integer.parseInt(br.readLine());
		double dis = 0;
		int min = price;
		
		if (5 <= n) {
			dis = 500;
			min = Math.min(min, price - (int)dis);
		}
		
		if (10 <= n) {
			dis = 0.9;
			min = Math.min(min, (int)(price * dis));
		}
		
		if (15 <= n) {
			dis = 2000;
			min = Math.min(min, price - (int)dis);
		}
		
		if (20 <= n) {
			dis = 0.75;
			min = Math.min(min, (int)(price * dis));
		}
		
		if (min < 0) {
			min = 0;
		}
		
		System.out.println(min);
	}
}
