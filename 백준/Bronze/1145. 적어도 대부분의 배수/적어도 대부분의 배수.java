import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr = new int[5];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		arr[3] = Integer.parseInt(st.nextToken());
		arr[4] = Integer.parseInt(st.nextToken());
		int result = 0;
		
		Arrays.sort(arr);
		for (int i = arr[0]; ; i++) {
			if (check(i)) {
				result = i;
				break;	
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(int num) {
		boolean result = false;
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			if (num % arr[i] == 0) {
				count++;
			}
			
			if (count == 3) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
