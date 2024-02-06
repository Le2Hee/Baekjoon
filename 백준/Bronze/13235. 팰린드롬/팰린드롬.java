import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		if (sb.toString().equals(s)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}