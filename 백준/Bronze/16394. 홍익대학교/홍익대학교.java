import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num =  sc.nextInt();
		int result = num - 1946;
		sb.append(result);
		System.out.println(sb);
	}
}