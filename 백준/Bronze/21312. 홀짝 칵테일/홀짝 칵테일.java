import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int result = 0;
		List<Integer> list = new LinkedList<>();
		
		if (a % 2 == 1) {
			list.add(a);
			count++;
		}
		
		if (b % 2 == 1) {
			list.add(b);
			count++;
		}
		
		if (c % 2 == 1) {
			list.add(c);
			count++;
		}
		
		if (count == 3 || count == 0) {
			result = a * b * c;
		} else if (count == 2) {
			result = list.get(0) * list.get(1);
		} else if (count == 1) {
			result = list.get(0);
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}