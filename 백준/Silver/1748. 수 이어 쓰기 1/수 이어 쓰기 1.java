import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		long sum = 0;
		
		long[] whole = new long[10];
		for (int i = 0; i < 10; i++) {
			whole[i] = 9 * (long) Math.pow(10, i - 1) * i;
		}
		
		int len = str.length();
		for (int i = 1; i < len; i++) {
			sum += whole[i];
		}
		
		long num = Integer.parseInt(str);
		long number = num - (long) Math.pow(10, len - 1) + 1;
		sum += number * len;
		
		System.out.println(sum);
	}
}