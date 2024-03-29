import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		char game = st.nextToken().charAt(0);
		int result = 0;
		
		String name;
		HashSet<String> set = new HashSet<>();
		while (n-- > 0) {
			name = br.readLine();
			set.add(name);
		}
		
		switch (game) {
		case 'Y' :
			result = set.size();
			break;
		case 'F' :
			result = set.size() / 2;
			break;
		case 'O' :
			result = set.size() / 3;
			break;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}