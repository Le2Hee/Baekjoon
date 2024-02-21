import java.io.*;
import java.util.*;

public class Main {
	
	static int[] key = {1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979, 1980, 1983, 1984, 1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016};
	static String[] val = {"DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory", "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", "AladdinSane", "PinUps", "DiamondDogs", "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger", "ScaryMonstersAndSuperCreeps", "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside", "Earthling", "Hours", "Heathen", "Reality", "TheNextDay", "BlackStar"};
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			search(start, end);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search(int s, int e) {
		int count = 0;
		List<String> list = new LinkedList<>();
		
		for (int i = 0; i < 25; i++) {
			if (s <= key[i] && key[i] <= e) {
				count++;
				list.add(String.valueOf(key[i]) + " " + val[i]);
			}
		}
		
		sb.append(count).append("\n");
		
		for (String str : list) {
			sb.append(str).append("\n");
		}
	}
}
