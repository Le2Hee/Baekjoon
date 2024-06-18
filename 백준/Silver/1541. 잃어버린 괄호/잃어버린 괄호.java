import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true);

		int sum = 0;
		boolean check = false;

		String s;
		while (st.hasMoreElements()) {
			s = st.nextToken();
			
			if (s.charAt(0) != '-' && s.charAt(0) != '+') {
				if (check) {
					sum -= Integer.parseInt(s);
				} else {
					sum += Integer.parseInt(s);
				}
			} else if (!check) {
				if (s.equals("-")) {
					check = true;
				}
			}
		}

		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}