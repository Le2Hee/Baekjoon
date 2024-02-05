import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = {
				Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine()),
				Integer.parseInt(br.readLine())
		};
		
		if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
			System.out.printf("Fish Rising");
		} else if(arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]) {
			System.out.printf("Fish Diving");
		} else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
			System.out.printf("Fish At Constant Depth");
		} else {
			System.out.printf("No Fish");
		}
	}
}