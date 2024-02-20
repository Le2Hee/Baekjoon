import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 기차 수
		int m = Integer.parseInt(st.nextToken()); // 명령 수
		
		int[] train = new int[n + 1];
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());
			int seat = -1;
			
			switch (num) {
			case 1 :
				seat += Integer.parseInt(st.nextToken());
				train[index] |= (1 << seat);
				break;
			case 2 :
				seat += Integer.parseInt(st.nextToken());
				train[index] &= ~(1 << seat);
				break;
			case 3 :
				train[index] = (train[index] & ~(1 << 19)) << 1;
				break;
			case 4 :
				train[index] = (train[index] & ~(1 << 0)) >> 1;
				break;
			}
		}
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			set.add(train[i]);
		}
		
		bw.write(Integer.toString(set.size()));
		bw.flush();
		bw.close();
		br.close();
	}
}