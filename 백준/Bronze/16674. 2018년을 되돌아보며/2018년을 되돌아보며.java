import java.io.*;
import java.util.*;

public class Main {
	
	static int[] count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		count = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - '0']++;
		}
		
		if (check2018()) {
			if (close()) {
				if (tied()) {
					sb.append(8);
				} else {
					sb.append(2);
				}
			} else {
				sb.append(1);
			}
		} else {
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check2018() {
		boolean result = true;
		
		for (int i = 3; i < 8; i++) {
			if (count[i] != 0) {
				result = false;
				break;
			}
		}
	
		if (result && count[9] > 0) {
			result = false;
		}
		
		return result;
	}
	
	private static boolean tied() {
		return count[2] == count[0] && count[0] == count[1] && count[1] == count[8];
	}
	
	private static boolean close() {
		return count[2] > 0 && count[0] > 0 && count[1] > 0 && count[8] > 0;
	}
}