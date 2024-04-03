import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n * 2];
		for (int i = 0; i < n * 2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] nums = new int[n];
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			nums[i] = arr[i] + arr[(2 * n) - 1 - i];
		}
		
		Arrays.sort(nums);
		bw.write(Integer.toString(nums[0]));
		bw.flush();
		bw.close();
		br.close();
	}
}