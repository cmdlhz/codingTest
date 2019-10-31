package dozero;

public class LengthReturn {
	public boolean solution(String s) {
		boolean answer = true;
		if (s.length() == 4 || s.length() == 6) {
			try {
				int i = Integer.parseInt(s);
			} catch (Exception e) {
				answer = false;
			}
		}else {
			answer = false;
		}
		return answer;
	}

}