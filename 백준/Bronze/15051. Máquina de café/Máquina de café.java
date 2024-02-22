import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		min = Math.min(Math.min((b * 2) + (c * 4), (a * 2) + (c * 2)), (a * 4) + (b * 2));
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();
	}
}