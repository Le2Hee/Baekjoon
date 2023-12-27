import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(xor);
		System.out.println(nota);
		System.out.println(notb);
	}
}