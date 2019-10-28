package kimsungkook;

public class Practice4 {
	public int solution(int n) {
		int answer = n;
		int cnt = 0;
		for (int i = 3; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
		}
		answer = answer - cnt -1;
		return answer;
	}

	public static void main(String[] args) {
		Practice4 p4 = new Practice4();
		System.out.println(p4.solution(1000000));
	}
}
