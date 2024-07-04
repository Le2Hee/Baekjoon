import java.io.*;
import java.util.*;

public class Main {
	
	static List<boolean[]> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int n, num;
		long sum;
		StringTokenizer st;
		while (t-- > 0) {
			list = new LinkedList<>();
			sum = 0;
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 숫자의 개수
			
			for (int i = 0; i < n; i++) {
				num = Integer.parseInt(st.nextToken());
				divisor(num, i);
			}
			
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					sum += maxnum(i, j);
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 2개의 리스트에서 최대공약수를 찾아주는 함수.
	private static int maxnum(int a, int b) {
		for (int i = (list.get(a).length > list.get(b).length ? list.get(b).length - 1 : list.get(a).length - 1); i >= 0; i--) {
			if (list.get(a)[i] && list.get(b)[i]) {
				return i;
			}
		}
		
		return 1;
	}
	
	// 약수를 찾아주는 함수.
	private static void divisor(int num, int index) {
		list.add(new boolean[num + 1]);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list.get(index)[i] = true;
			}
		}
	}
}
