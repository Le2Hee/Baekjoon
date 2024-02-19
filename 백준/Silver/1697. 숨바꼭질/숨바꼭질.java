import java.io.*;
import java.util.*;

public class Main {

	static int k;
	static int[] count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		count = new int[100001];
		
		bw.write(Integer.toString(search(n)));
		bw.flush();
		bw.close();
		br.close();
	}

	private static int search(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		
		int index = n;
		int num = 0;
		count[index] = 1;
		
		while (!q.isEmpty()) {
			num = q.remove();
			
			if (num == k) {
				return count[num] - 1;
			}
			
			if (num - 1 >= 0 && count[num - 1] == 0) {
				count[num - 1] = count[num] + 1;
				q.add(num - 1);
			}
			
			if (num + 1 <= 100000 && count[num + 1] == 0) {
				count[num + 1] = count[num] + 1;
				q.add(num + 1);
			}
			
			if (num * 2 <= 100000 && count[num * 2] == 0) {
				count[num * 2] = count[num] + 1;
				q.add(num * 2);
			}
		}
		
		return -1;
	}
}
