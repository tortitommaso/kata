package unsplice;
/*
 * Given a string, strip all occurences of consecutively 
occuring backslash and newline characters. For example, 
assuming that:
"\\" represents '\' and 
"\n" represents '\n'
 */

public class Unsplice {

	public String run(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (currentElement(string, i).equals("\\") && nextElement(string, i).equals("\n")) {
				i++;
			} else {
				result += currentElement(string, i);
			}
		}
		return result;
	}

	private String nextElement(String string, int i) {
		return string.substring(i+1, i+2);
	}

	private String currentElement(String string, int i) {
		return string.substring(i, i+1);
	}

}
