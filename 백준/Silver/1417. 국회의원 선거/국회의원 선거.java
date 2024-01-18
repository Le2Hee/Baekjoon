import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[n];
		int num;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			count[i] = num;
		}
		
		while (true) {
			int max = Integer.MIN_VALUE;
			int index = 0;
			
			for (int i = 1; i < n; i++) {
				if (max < count[i]) {
					index = i;
					max = count[i];
				}
			}
			
			if (max >= count[0]) {
				result++;
				count[index]--;
				count[0]++;
			} else {
				break;
			}
		}
		
		System.out.println(result);
	}
}