import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int count = 0;
			int startx = x;
			int starty = y;
			int maxCount = maxVal(n, m);
			
			if (m < n) {
				starty = x;
				count += x;
				
				if (!(startx == x && starty == y)) {
					while (true) {
						starty += m;
						count += m;
						
						if (starty > n) {
							starty -= n;
						}
						
						if (count > maxCount) {
							count = -1;
							break;
						} else if(starty == y) {
							break;
						}
					}
				}
			} else if (m == n) {
				if (x != y) {
					count = -1;
				} else if (x > m) {
					count = -1;
				} else {
					count = x;
				}
			} else {
				startx = y;
				count += y;
				
				if (!(startx == x && starty == y)) {
					while (true) {
						startx += n;
						count += n;
						
						if (startx > m) {
							startx -= m;
						}
						
						if (count > maxCount) {
							count = -1;
							break;
						} else if (startx == x) {
							break;
						}
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
	
	private static int maxVal(int a, int b) {
		int result = 0;
		
		for (int i = 1; ; i++) {
			if ((a * i) % b == 0) {
				result = a * i;
				break;
			}
		}
		
		return result;
	}
}