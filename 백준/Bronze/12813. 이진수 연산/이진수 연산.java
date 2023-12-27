import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] a = br.readLine().split("");
		String[] b = br.readLine().split("");
		
		StringBuilder and = new StringBuilder();
		StringBuilder or = new StringBuilder();
		StringBuilder xor = new StringBuilder();
		StringBuilder nota = new StringBuilder();
		StringBuilder notb = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) {
			int an = Integer.parseInt(a[i]);
			int bn = Integer.parseInt(b[i]);
			
			and.append(an & bn);
			or.append(an | bn);
			xor.append(an ^ bn);
			nota.append(an ^ 1);
			notb.append(bn ^ 1);
		}
		
		sb.append(and).append("\n").append(or).append("\n").append(xor).append("\n").append(nota).append("\n").append(notb);
		
		System.out.println(sb);
	}
}