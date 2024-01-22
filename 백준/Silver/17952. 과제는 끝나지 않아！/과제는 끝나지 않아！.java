import java.io.*;
import java.util.*;

public class Main {
	
	public static class Task {
		int score, time;
		
		public Task(int s, int t) {
			score = s;
			time = t;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int sum = 0;
		List<Task> list = new LinkedList<>();
		Task task;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s, t;
			
			switch (Integer.parseInt(st.nextToken())) {
			case 1:
				s = Integer.parseInt(st.nextToken());
				t = Integer.parseInt(st.nextToken()) - 1;
				if (t == 0) {
					sum += s;
				} else {
					task = new Task(s, t);
					list.add(task);
				}
				break;
			case 0 :
				if (list.size() == 0) {
					break;
				}
				
				task = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				task.time--;
				
				if (task.time == 0) {
					sum += task.score;
				} else {
					list.add(task);
				}
				break;
			}
		}
		
		System.out.println(sum);
	}
}