package wrapper;

public class Wrapper {

	public String wrap(String aString, int n) {
		if (n < aString.length()) {
			String actual =  aString.substring(0, n);
			String nextSection = aString.substring(n , aString.length());	
			if (actual.contains(" ")) {
				return actual.replace(" ", "\n") + wrap(nextSection, n);
			} else
				return actual + "\n" + wrap(nextSection, n);
		}
		return aString;
	}

}
