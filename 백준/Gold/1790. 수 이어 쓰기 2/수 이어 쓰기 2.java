import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long num = 0;
		long len = 1;
		long count = 9;
		
		while (k > len * count) {
			k -= len * count;
			num += count;
			
			len++;
			count *= 10;
		}
		
		num++;
		num += (k  -1) / len;
		
		if (num > n) {
			System.out.println(-1);
		} else {
			int index = (int) ((k - 1) % len);
			System.out.println(String.valueOf(num).charAt(index));
		}
	}
}