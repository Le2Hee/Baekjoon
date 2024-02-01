import java.io.*;
import java.util.*;

public class Main {
	
	public static class Coordinates {
		int x, y;
		
		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int n, m, sum;
	static List<Coordinates> one, two;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		sum = Integer.MAX_VALUE;
		
		one = new LinkedList<>();
		two = new LinkedList<>();
		Coordinates c;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if (num == 1) {
					c = new Coordinates(j, i);
					one.add(c);
				} else if (num == 2) {
					c = new Coordinates(j, i);
					two.add(c);
				}
			}
		}
		
		visit = new boolean[two.size()];
		backtracking(0, 0);
		System.out.println(sum);
	}
	
	private static void backtracking(int num, int start) {
		if (num == m) {
			int subSum = 0;
			
			for (Coordinates c : one) {
				int min = Integer.MAX_VALUE;
				for (int i = 0; i < two.size(); i++) {
					if (visit[i]) {
						min = Math.min(min, Math.abs(two.get(i).x - c.x) + Math.abs(two.get(i).y - c.y));
					}
				}
				subSum += min;
			}
			
			sum = Math.min(sum, subSum);
			return;
		}
		
		for (int i = start; i < two.size(); i++) {
			visit[i] = true;
			backtracking(num + 1, i + 1);
			visit[i] = false;
		}
	}
}