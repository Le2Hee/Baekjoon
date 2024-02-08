import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int count = 0;
		
		while ((s = br.readLine()) != null) {
			count++;
		}
		
		System.out.println(count);
	}
}