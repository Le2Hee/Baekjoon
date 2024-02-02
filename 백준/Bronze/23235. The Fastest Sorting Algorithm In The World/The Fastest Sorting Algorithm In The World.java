import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		String s = "";
		int count = 0;
		
		while (!(s = br.readLine()).equals("0")) {
			count++;
			sb.append("Case ").append(count).append(": Sorting... done!").append("\n");
		}
		
		System.out.println(sb);
	}
}