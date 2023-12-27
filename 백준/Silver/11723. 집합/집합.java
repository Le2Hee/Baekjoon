import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int bit = 0;

		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if (str.equals("all")) {
				bit = (1 << 21) - 1;
			} else if (str.equals("empty")) {
				bit = 0;
			} else {
				int num = Integer.parseInt(st.nextToken());
				if (str.equals("add")) {
					bit |= 1 << num - 1;
				} else if (str.equals("remove")) {
					bit &= ~(1 << num - 1);
				} else if (str.equals("check")) {
					sb.append((bit & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
				} else if (str.equals("toggle")) {
					bit ^= 1 << num - 1;
				}
			}
		}
		
		System.out.println(sb);
	}
}