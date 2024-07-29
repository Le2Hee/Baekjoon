import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());

		sb.append(first());
		if (n > 3) {
			StringBuilder sub;
			
			int renum = 0;
			for (int i = 0; i <= 10; i++) {
				if (3 * Math.pow(2, i) == n) {
					renum = i;
					break;
				}
			}
			
			for (int i = 1; i <= renum; i++) {
				sub = new StringBuilder();
				sub.append(sb.toString());
				
				sb = new StringBuilder();
				sb.append(second(sub.toString(), i));
			}
		}

		bw.write(print(sb.toString(), n));
		bw.flush();
		bw.close();
		br.close();
	}

	private static String first() {
		StringBuilder sub = new StringBuilder();

		sub.append("  *  ");
		sub.append(" * * ");
		sub.append("*****");

		return sub.toString();
	}

	private static String second(String str, int re) {
		StringBuilder sub = new StringBuilder();

		int h = 3 * (int) Math.pow(2, re - 1);
		int rePow = (int) Math.pow(2, re);
		int index = 0;
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < 2 * h; i++) {
			for (int j = 1; j <= rePow * 5 + rePow - 1; j++) {
				if (i < h) {
					if (3 * Math.pow(2, re) / 2 < j && j < rePow * 5 + rePow - 3 * Math.pow(2, re) / 2) {
						sub.append(str.charAt(index++));
					} else {
						sub.append(" ");
					}
				} else {
					if (j <= str.length() / h) {
						sub.append(str.charAt(index1++));
					} else if (j == str.length() / h + 1) {
						sub.append(" ");
					} else {
						sub.append(str.charAt(index2++));
					}
				}
			}
		}
		
		return sub.toString();
	}
	
	private static String print(String str, int n) {
		int h = n;
		int w = str.length() / h;
		int index = 0;
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				result.append(str.charAt(index++));
			}
			result.append("\n");
		}
		
		return result.toString();
	}
}