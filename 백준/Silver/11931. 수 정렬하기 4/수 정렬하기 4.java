import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		List<Integer> list = new LinkedList<>();
		while (t-- > 0) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list, (o1, o2) -> o2 - o1);
		for (int num : list) {
			sb.append(num).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
