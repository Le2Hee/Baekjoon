import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int nextM = Integer.parseInt(br.readLine());
		int thisM = Integer.parseInt(br.readLine());
		int result = 0;
		thisM += 60;
		
		if (thisM >= nextM) {
			result = nextM * 1500;
		} else {
			result = thisM * 1500;
			nextM -= thisM;
			result += nextM * 3000;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}