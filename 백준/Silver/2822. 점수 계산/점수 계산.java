import java.io.*;
import java.util.*;

public class Main {
	
	public static class Que {
		int score, num;
		
		public Que(int s, int n) {
			score = s;
			num = n;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int sum = 0, s;
		List<Que> list = new LinkedList<>();
		for (int i = 1; i < 9; i++) {
			s = Integer.parseInt(br.readLine());
			list.add(new Que(s, i));
		}
		
		Collections.sort(list, (o1, o2) -> o2.score - o1.score);
		int[] nums = new int[5];
		
		for (int i = 0; i < 5; i++) {
			sum += list.get(i).score;
			nums[i] = list.get(i).num;
		}
		
		Arrays.sort(nums);
		sb.append(sum).append("\n");
		for (int num : nums) {
			sb.append(num).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}