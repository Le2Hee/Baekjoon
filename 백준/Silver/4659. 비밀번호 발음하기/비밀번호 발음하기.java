import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		char[] arr;
		boolean change, include, check;
		int count;
		while (!(s = br.readLine()).equals("end")) {
			arr = s.toCharArray();
			change = false; // 모음 false, 자음 true
			include = false;
			check = true;
			count = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (vowelCheck(arr[i])) {
					include = true;
					if (!change) {
						count++;
					} else {
						count = 1;
						change = false;
					}
				} else {
					if (change) {
						count++;
					} else {
						count = 1;
						change = true;
					}
				}
				
				if (count == 3) {
					check = false;
					break;
				}
				
				if (i > 0 && arr[i - 1] == arr[i] && arr[i] != 'e' && arr[i] != 'o') {
					check = false;
					break;
				}
			}
			
			if (check && !include) {
				check = false;
			}
			
			sb.append("<").append(s).append(">");
			
			if (check) {
				sb.append(" is acceptable.\n");
			} else {
				sb.append(" is not acceptable.\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean vowelCheck(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}