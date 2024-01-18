import java.io.*;
import java.util.*;

public class Main {
	
	public static class Country {
		int name, gold, silver, bronze, rank;
		
		public Country(int n, int g, int s, int b, int r) {
			name = n;
			gold = g;
			silver = s;
			bronze = b;
			rank = r;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Country ct;
		List<Country> list = new LinkedList<>();
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int name = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ct = new Country(name, g, s, b, 1);
			list.add(ct);
		}
		
		Collections.sort(list, new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				int num = 0;
				
				if (o1.gold - o2.gold < 0) {
					num = 1;
				} else if (o1.gold - o2.gold == 0) {
					if (o1.silver - o2.silver < 0) {
						num = 1;
					} else if (o1.silver - o2.silver == 0) {
						if (o1.bronze - o2.bronze < 0) {
							num = 1;
						} else if (o1.bronze - o2.bronze == 0) {
							num = 0;
						} else {
							num = -1;
						}
					} else {
						num = -1;
					}
				} else {
					num = -1;
				}
				
				return num;
			}
		});
		
		int result = 0;
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1).gold == list.get(i).gold && list.get(i - 1).silver == list.get(i).silver && list.get(i - 1).bronze == list.get(i).bronze) {
				list.get(i).setRank(list.get(i - 1).rank);
			} else {
				list.get(i).setRank(i + 1);
			}
			
			if (list.get(i).name == m) {
				result = list.get(i).rank;
			}
		}
		
		if (result == 0) {
			result = list.get(0).rank;
		}
		
		System.out.println(result);
	}
}