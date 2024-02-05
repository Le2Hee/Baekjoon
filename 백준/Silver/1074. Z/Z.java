import java.io.*;
import java.util.*;

public class Main {
	
	static int n, h, w, len, count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		len = (int)Math.pow(2, n);
		count = 0;
		search();
		System.out.println(count);
	}
	
	private static void search() {
		if (len == 1) {
			return;
		}
		
		if (w < len / 2 && h < len / 2) {
			len /= 2;
			search();
		} else if (len / 2 <= w && h < len / 2) {
			count += Math.pow(len, 2) / 4;
			w -= len / 2;
			len /= 2;
			search();
		} else if (w < len / 2 && len / 2 <= h) {
			count += (Math.pow(len, 2) / 4) * 2;
			h -= len / 2;
			len /= 2;
			search();
		} else {
			count += (Math.pow(len, 2) / 4) * 3;
			w -= len / 2;
			h -= len / 2;
			len /= 2;
			search();
		}
	}
}
