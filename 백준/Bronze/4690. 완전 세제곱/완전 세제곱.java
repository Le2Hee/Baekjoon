import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 6; i <= 100; i++) {
			boolean bo = false;
			
			for (int a = 2; a < i; a++) {
				for (int b = a; b < i; b++) {
					for (int c = b; c < i; c++) {
						if (Math.pow(i, 3) == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
							sb.append("Cube = ").append(i).append(", Triple = (").append(a).append(",").append(b).append(",").append(c).append(")").append("\n");
						}
					}
				}
			}
		}
		
		System.out.println(sb);
	}
}