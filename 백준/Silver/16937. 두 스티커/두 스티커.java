import java.io.*;
import java.util.*;

public class Main {
	
	public static class Sticker {
		int h, w;
		
		public Sticker(int h, int w) {
			this.h = h;
			this.w = w;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		List<Sticker> list = new LinkedList<>();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int sh = Integer.parseInt(st.nextToken());
			int sw = Integer.parseInt(st.nextToken());
			
			if (!((sh > h && sh > w) || (sw > h && sw > w))) {
				list.add(new Sticker(sh, sw));
			}
		}
		
		int max = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			int fh = h - list.get(i).h;
			int fw = w - list.get(i).w;
			int sh = h - list.get(i).w;
			int sw = w - list.get(i).h;
			
			for (int j = i + 1; j < list.size(); j++) {
				int y = list.get(j).h;
				int x = list.get(j).w;
				
				if ((fh >= 0 && fw >= 0) && ((fh >= y && w >= x) || (fh >= x && w >= y) || (h >= y && fw >= x) || (h >= x && fw >= y))) {
					max = Math.max(max, (list.get(i).h * list.get(i).w) + (x * y));
				}
				
				if ((sh >= 0 && sw >= 0) && ((sh >= y && w >= x) || (sh >= x && w >= y) || (h >= y && sw >= x) || (h >= x && sw >= y))) {
					max = Math.max(max, (list.get(i).h * list.get(i).w) + (x * y));
				}
			}
		}
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
}