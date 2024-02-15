import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		Integer[] burger = new Integer[b];
		Integer[] side = new Integer[s];
		Integer[] drink = new Integer[d];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++ ) {
			burger[i] = Integer.parseInt(st.nextToken());
			sum += burger[i];
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < s; i++) {
			side[i] = Integer.parseInt(st.nextToken());
			sum += side[i];
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < d; i++) {
			drink[i] = Integer.parseInt(st.nextToken());
			sum += drink[i];
		}
		
		Arrays.sort(burger, (o1, o2) -> o2 - o1);
		Arrays.sort(side, (o1, o2) -> o2 - o1);
		Arrays.sort(drink, (o1, o2) -> o2 - o1);
		
		int indexMin = Math.min(Math.min(b, s), d);
		int dis = 0;
		
		for (int i = 0; i < indexMin; i++) {
			dis += (burger[i] + side[i] + drink[i]) * 0.9;
		}
		
		for (int i = indexMin; i < b; i++) {
			dis += burger[i];
		}
		
		for (int i = indexMin; i < s; i++) {
			dis += side[i];
		}
		
		for (int i = indexMin; i < d; i++) {
			dis += drink[i];
		}
		
		sb.append(sum).append("\n").append(dis);
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}