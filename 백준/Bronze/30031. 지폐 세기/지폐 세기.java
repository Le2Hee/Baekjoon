import java.io.*;
import java.util.*;

public class Main {
	
	static Map<Integer, Integer> money = new LinkedHashMap<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		setMap();
		int sum = 0;
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			sum += money.get(w);
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void setMap() {
		int[] key = {136, 142, 148, 154};
		int[] val = {1000, 5000, 10000, 50000};
		
		for (int i = 0; i < 4; i++) {
			money.put(key[i], val[i]);
		}
	}
}