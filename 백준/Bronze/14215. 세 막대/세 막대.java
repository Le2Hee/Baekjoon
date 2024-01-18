import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] stick = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		Arrays.sort(stick);
		
		int sum = stick[0] + stick[1];
		
		if (sum <= stick[2]) {
			sum += sum -1;
		} else {
			sum += stick[2];
		}
		
		System.out.println(sum);
	}
}