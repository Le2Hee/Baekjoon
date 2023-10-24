import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while (!(str = br.readLine()).equals("#")) {
			int count = 0;
			
			String[] arr = str.split("");
			
			for (int i = 0; i < arr.length; i++) {
				if (
						arr[i].equals("a") || 
						arr[i].equals("e") ||
						arr[i].equals("i") ||
						arr[i].equals("o") ||
						arr[i].equals("u") ||
						arr[i].equals("A") ||
						arr[i].equals("E") ||
						arr[i].equals("I") ||
						arr[i].equals("O") ||
						arr[i].equals("U")
						)
					count++;
			}
			
			sb.append(String.valueOf(count)).append("\n");
		}
		
		System.out.println(sb);
	}
}