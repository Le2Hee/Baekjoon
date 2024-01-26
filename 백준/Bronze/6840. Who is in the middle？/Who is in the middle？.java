import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = {
				Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine())
		};
		
		Arrays.sort(num);
		System.out.println(num[1]);
	}
}