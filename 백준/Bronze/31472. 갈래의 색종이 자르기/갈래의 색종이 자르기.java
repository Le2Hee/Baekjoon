import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int result = ((int)Math.sqrt((n / 2))) * 8;
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}