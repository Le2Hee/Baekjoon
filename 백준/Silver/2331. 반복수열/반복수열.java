import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;
	static List<Integer> list;
	static int num = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		
		visit = new boolean[10000000];
		list = new LinkedList<>();
		list.add(Integer.parseInt(n));
		visit[list.get(0)] = true;
		check(n, m);
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == num) {
				break;
			} else {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	private static void check(String n, int m) {
		int sum = 0;
		
		for (int i = 0; i < n.length(); i++) {
			sum += (int)Math.pow((int)n.charAt(i) - '0', m);
		}
		
		if (!visit[sum]) {
			list.add(sum);
			visit[sum] = true;
			check(String.valueOf(sum), m);
		} else {
			num = sum;
		}
	}
}