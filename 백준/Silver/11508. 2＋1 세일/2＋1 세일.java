import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		int count = 0;
		Arrays.sort(arr);
		for (int i = n - 1; i >= 0; i--) {
			count++;
			
			if (count == 3) {
				count = 0;
			} else {
				sum += arr[i];
			}
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
