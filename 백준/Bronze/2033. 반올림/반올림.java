import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int len = s.length();

		double num = Double.parseDouble(s) / (Math.pow(10, len));
		
		for (int i = len - 1; i > 0; i--) {
			String format = String.format("%." + i + "f", num);
			num = Double.parseDouble(format);
		}
		
		String result = String.format("%.0f", num * (Math.pow(10, len)));
		System.out.println(result);
	}
}