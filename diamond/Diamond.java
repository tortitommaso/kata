package diamond;

/*
 * Given a letter print a diamond starting with 'A'
with the supplied letter at the widest point.
 */
public class Diamond {

	public String print(String character) {
		int max = charToIndex(character);
		String result = "";
		for (int row = 0; row <= max; row++) {
			for (int column = 0; column <= max * 2; column++) { 
				if ( leftDiagonal(max, row, column) || rightDiagonal(max, row, column) ) {
					result += indexToChar(row);
				} else {
					result += " ";					
				}
				
			}
			result += "\n";
		}
		result = addReverse(result);
		return result; 
	}



	private boolean rightDiagonal(int max, int row, int column) {
		return column-row == max;
	}



	private boolean leftDiagonal(int max, int row, int column) {
		return column+row == max;
	}



	private String addReverse(String result) {
		String[] token = result.split("\n");
		for (int i = token.length -2; i >= 0; i--) {
			result +=  token[i] + "\n";
		}
		return result;
	}

	

	public int charToIndex(String string) {
		return (int)string.charAt(0) - 65;
	}

	public char indexToChar(int i) {
		return (char) (i + 65);
	}
}
