import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String o = br.readLine();
		String s = br.readLine();
		o = o.replaceAll(s, "A");
		
		int count = 0;
		for (int i = 0; i < o.length(); i++) {
			if (o.charAt(i) == 'A') {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
