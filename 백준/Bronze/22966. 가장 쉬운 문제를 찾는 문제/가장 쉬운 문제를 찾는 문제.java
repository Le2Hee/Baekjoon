import java.io.*;
import java.util.*;

public class Main {
	
	public static class Question {
		String name;
		int level;
		
		public Question(String n, int l) {
			name = n;
			level = l;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Question> list = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Question q;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int l = Integer.parseInt(st.nextToken());
			q = new Question(name, l);
			list.add(q);
		}
		
		Collections.sort(list, new Comparator<Question>() {

			@Override
			public int compare(Question o1, Question o2) {
				return o1.level - o2.level;
			}
		});
		
		System.out.println(list.get(0).name);
	}
}