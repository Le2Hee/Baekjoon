import java.io.*;
import java.util.*;

public class Main {
	
	static int[] nums = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aLen = Integer.parseInt(st.nextToken());
		int bLen = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		int minLen = Math.min(aLen, bLen);
		StringBuilder combi = new StringBuilder();
		for (int i = 0; i < minLen; i++) {
			combi.append(a.charAt(i)).append(b.charAt(i));
		}
		
		if (minLen == aLen) {
			for (int i = minLen; i < bLen; i++) {
				combi.append(b.charAt(i));
			}
		} else if (minLen == bLen) {
			for (int i = minLen; i < aLen; i++) {
				combi.append(a.charAt(i));
			}
		}
		
		List<Integer> combinum = new LinkedList<>();
		for (int i = 0; i < aLen + bLen; i++) {
			combinum.add(nums[combi.charAt(i) - 'A']);
		}
		
		while (combinum.size() > 2) {
			List<Integer> sub = new LinkedList<>();
			for (int i = 0; i < combinum.size() - 1; i++) {
				int num = combinum.get(i) + combinum.get(i + 1);
				if (num >= 10) {
					num %= 10;
				}
				sub.add(num);
			}
			combinum = new LinkedList<>(sub);
		}
		
		if (combinum.get(0) != 0) {
			sb.append(combinum.get(0));
		}
		
		sb.append(combinum.get(1)).append("%");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}