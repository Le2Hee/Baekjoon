import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder(); 
	static int len, w;
	static char[] str;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		str = br.readLine().toCharArray();
		len = str.length;
		
		first();
		w = sb.length();
		second();
		third();
		second();
		first();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void first() {
		int count = 1;
		
		sb.append("..");
		for (int i = 0; i < len; i++) {
			if (count > 2 && count % 3 == 0) {
				sb.append('*');
			} else {
				sb.append("#");
			}
			count++;
			
			if (i != len - 1) {
				sb.append("...");
			}
		}
		
		sb.append("..\n");
	}
	
	private static void second() {
		double count = 0.5;
		
		for (int i = 1; i < w; i++) {
			if (i % 2 == 1) {
				sb.append(".");
			} else {
				if (count > 2 && Math.round(count) % 3 == 0) {
					sb.append("*");
				} else {
					sb.append("#");
				}
				count += 0.5;
			}
		}
		
		sb.append("\n");
	}
	
	private static void third() {
		int index = 0;
		int lenCount = 0;
		boolean bo = false;
		
		for (int i = 1; ; i++) {
			if (i % 2 == 0) {
				sb.append(".").append(str[index++]).append(".");
				lenCount += 3;
			} else {
				if ((index + 1) % 3 != 0 && !bo) {
					sb.append("#");
					lenCount++;
				} else {
					if (!bo && lenCount == w - 2) {
						sb.append("#");
					} else {
						sb.append("*");
						bo = !bo;
					}
					
					lenCount++;
				}
			}
			
			if (lenCount >= w - 1) {
				break;
			}
		}
		
		sb.append("\n");
	}
}
