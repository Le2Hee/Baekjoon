import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()) - 1;
		
		List<Integer> list = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		bw.write(Integer.toString(list.get(m)));
		bw.flush();
		bw.close();
		br.close();
	}
}