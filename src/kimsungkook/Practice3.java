package kimsungkook;

public class Practice3 {
	public boolean solution(String s) {
		boolean answer = true;
		if (s.length() == 4 || s.length() == 6) {
			try {
				long x = Long.parseLong(s);
			} catch (Exception e) {
				answer = false;
			}
		}else {
			answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		Practice3 st = new Practice3();
		System.out.println(st.solution("123456666"));
	}
}