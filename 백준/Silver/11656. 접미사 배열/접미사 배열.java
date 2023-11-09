import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] str = br.readLine().split("");
		String[] arr = new String[str.length];
		
		int minIndex = 0;
		
		for (int i = 0; i < str.length; i++) {
			for (int j = minIndex; j < str.length; j++) {
				if (minIndex == j) {
					arr[minIndex] = str[j];
				} else {
					arr[minIndex] += str[j];
				}
			}
			
			minIndex++;
		}
		
		Arrays.sort(arr);
		
		for (String s : arr) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}
}