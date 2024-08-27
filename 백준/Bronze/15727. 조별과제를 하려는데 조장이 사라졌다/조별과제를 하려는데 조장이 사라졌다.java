import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = (n % 5) == 0 ? n / 5 : n / 5 + 1;
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}