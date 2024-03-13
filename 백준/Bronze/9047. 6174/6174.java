import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		char[] arr;
		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			
			while (true) {
				if (num == 6174) {
					break;
				} else {
					count++;
					arr = Integer.toString(num).toCharArray();
					Arrays.sort(arr);
					String[] minMax = minMaxVal(arr);
					int max = Integer.parseInt(minMax[1]);
					int min = Integer.parseInt(minMax[0]);
					
					num = max - min;
					
					if (num < 1000) {
						num *= 10;
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String[] minMaxVal(char[] arr) {
		String[] result = new String[2];
		
		StringBuilder max = new StringBuilder();
		StringBuilder min = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			min.append(arr[i]);
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			max.append(arr[i]);
		}
		
		result[0] = min.toString();
		result[1] = max.toString();
		
		return result;
	}
	
}	