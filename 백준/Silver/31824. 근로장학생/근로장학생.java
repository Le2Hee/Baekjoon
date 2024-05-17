import java.io.*;
import java.util.*;

public class Main {
	
	public static class Dic {
		char start;
		String word;
		String meaning;
		
		public Dic (char s, String w, String m) {
			start = s;
			word = w;
			meaning = m;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정보의 개수
		int m = Integer.parseInt(st.nextToken()); // 문장의 개수
		
		List<Dic> list = new LinkedList<>();
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String word = st.nextToken(); // 단어
			String meaning = st.nextToken(); // 뜻
			list.add(new Dic(word.charAt(0), word, meaning));
		}
		
		Collections.sort(list, (o1, o2) -> o1.word.compareTo(o2.word)); // 단어를 사전순으로 정렬
		char c;
		String str;
		boolean check;
		
		while (m-- > 0) {
			str = br.readLine();
			check = false;
			
			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).start == c) { // 첫 글자가 동일하다면
						
						// 비교할 단어의 길이가 문자열을 넘지 않고, 두 단어가 일치 한다면
						if (i + list.get(j).word.length() <= str.length() && str.substring(i, i + list.get(j).word.length()).equals(list.get(j).word)) {
							check = true;
							sb.append(list.get(j).meaning);
						}
					}
				}
			}
			
			if (!check) { // 일치하는 단어가 없으면 -1을 출력.
				sb.append("-1");
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}