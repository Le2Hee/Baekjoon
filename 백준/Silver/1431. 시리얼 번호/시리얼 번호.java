import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		String s;
		List<String> list = new LinkedList<>();
		while (t-- > 0) {
			s = br.readLine();
			list.add(s);
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					char[] o1arr = o1.toCharArray();
					char[] o2arr = o2.toCharArray();
					int o1sum = 0;
					int o2sum = 0;
					
					for (int i = 0; i < o1.length(); i++) {
						if (Character.isDigit(o1arr[i])) {
							o1sum += o1arr[i] - '0';
						}
						
						if (Character.isDigit(o2arr[i])) {
							o2sum += o2arr[i] - '0';
						}
					}
					
					if (o1sum == o2sum) {
						return o1.compareTo(o2);
					}
					
					return o1sum - o2sum;
				}
				
				return o1.length() - o2.length();
			}
		});
		
		for (String str : list) {
			sb.append(str).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
