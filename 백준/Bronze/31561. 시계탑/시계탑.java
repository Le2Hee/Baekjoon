import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		double time = 0;
		
		if (m <= 30) {
			time = m / 2.0;
		} else {
			time = 15;
			m -= 30;
			time += m * 1.5;
		}
		
		bw.write(String.format("%.1f", time));
		bw.flush();
		bw.close();
		br.close();
	}
}