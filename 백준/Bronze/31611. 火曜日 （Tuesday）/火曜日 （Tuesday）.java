import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = Integer.parseInt(br.readLine()) % 7;
		if (result == 2) {
			result = 1;
		} else {
			result = 0;
		}
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}