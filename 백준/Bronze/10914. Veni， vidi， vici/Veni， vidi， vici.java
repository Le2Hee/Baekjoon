import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 암호화 키
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = st.countTokens();
		char[] arr;
		int num;
		for (int i = 0; i < size; i++) {
			arr = st.nextToken().toCharArray();
			
			for (int j = 0; j < arr.length; j += 2) {
				if (j + 1 >= arr.length) {
					break;
				} else {
					num = arr[j] - 'a' + arr[j + 1] - 'a' - n;
					
					if (num < 0) {
						num += 26;
					} else if (num > 25) {
						num %= 26;
					}
					
					sb.append((char)(num + 'a'));
				}
			}
			
			sb.append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}