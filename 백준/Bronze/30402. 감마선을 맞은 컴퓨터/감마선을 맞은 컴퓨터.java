import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[15];
		
		for (int i = 0; i < 15; i++) {
			arr[i] = br.readLine();
		}
		
		int num = 0;
		
		for (int i = 0; i < 15; i++) {
			StringTokenizer st = new StringTokenizer(arr[i]);
			
			for (int j = 0; j < 15; j++) {
				String str = st.nextToken();
				
				if (str.equals("w")) {
					System.out.println("chunbae");
					num = 1;
					break;
				} else if (str.equals("b")) {
					System.out.println("nabi");
					num = 1;
					break;
				} else if (str.equals("g")) {
					System.out.println("yeongcheol");
					num = 1;
					break;
				}
			}
			
			if (num == 1) {
				break;
			}
		}
	}
}