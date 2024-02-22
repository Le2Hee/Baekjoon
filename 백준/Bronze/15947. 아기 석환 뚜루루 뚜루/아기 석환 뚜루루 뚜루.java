import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] key = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"};
		// 14
		int n = Integer.parseInt(br.readLine()) - 1;
		int a = n / 14;
		int b = n % 14;
		int count = 0;
		
		if (b == 2 || b == 6 || b == 10) {
			count = 2 + a;
		} else if (b == 3 || b == 7 || b == 11) {
			count = 1 + a;
		} else {
			sb.append(key[b]);
		}
		
		if (sb.length() == 0) {
			sb.append("tu");
			
			if (count >= 5) {
				sb.append("+ru*").append(count);
			} else {
				for (int i = 0; i < count; i++) {
					sb.append("ru");
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
