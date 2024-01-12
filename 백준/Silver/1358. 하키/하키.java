import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int count = 0;
		double r = h / 2.0;
		int oy = y + (int)r;
		int seox = x + w;
		
		while (p-- > 0) {
			st = new StringTokenizer(br.readLine());
			int memberx = Integer.parseInt(st.nextToken());
			int membery = Integer.parseInt(st.nextToken());
			
			double fio = Math.sqrt((Math.pow(x - memberx, 2)) + (Math.pow(oy - membery, 2)));
			double seo = Math.sqrt((Math.pow(seox - memberx, 2)) + (Math.pow(oy - membery, 2)));
			
			if (fio <= r || seo <= r) {
				count++;
			} else if (memberx >= x && membery <= y + h && memberx <= x + w && membery >= y) {
				count++;
			}
		}
		
		sb.append(count);
		System.out.println(sb);
	}
}