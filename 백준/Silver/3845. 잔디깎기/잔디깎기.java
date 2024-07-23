import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		int nx, ny;
		double w, now;
		boolean check;
		List<Double> arr;
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0 0 0.0")) {
			st = new StringTokenizer(s);
			nx = Integer.parseInt(st.nextToken()); // 가로를 평행하게 깍은 횟수
			ny = Integer.parseInt(st.nextToken()); // 세로를 평행하게 깍은 횟수
			w = Double.parseDouble(st.nextToken()); // 폭
			
			check = true;
			arr = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < nx; i++) {
				arr.add(Double.parseDouble(st.nextToken()));
			}
			Collections.sort(arr);
			
			now = 0;
			for (int i = 0; i < nx; i++) {
				if (arr.get(i) - (w / 2) <= now) {
					now = arr.get(i) + (w / 2);
				} else {
					check = false;
					break;
				}
			}
			
			if (!check || now < 75) {
				br.readLine();
				sb.append("NO\n");
				continue;
			}
			
			arr = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < ny; i++) {
				arr.add(Double.parseDouble(st.nextToken()));
			}
			Collections.sort(arr);
			
			now = 0;
			for (int i = 0; i < ny; i++) {
				if (arr.get(i) - (w / 2) <= now) {
					now = arr.get(i) + (w / 2);
				} else {
					check = false;
					break;
				}
			}
			
			if (!check || now < 100) {
				sb.append("NO\n");
			} else {
				sb.append("YES\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}