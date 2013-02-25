package pythagoras;

/*
 * Write a http://en.wikipedia.org/wiki/Multiplication_table 
 * given an integer as input
 */
public class TableofPythagoras {

	private int limit;

	public TableofPythagoras(int limit) {
		this.limit = limit;
	}

	public String print() {
		String result = "";
		for (int i = 1; i <= limit; i++) {
			for (int j = 1; j <= limit; j++) {
				result += format(i, j);
			}
			result += "\n";
		}
		return result;
	}

	private String format(int i, int j) {
		int numberLength = String.valueOf(limit * limit).length();
		return String.format("%" + numberLength + "d|", (i * j));
	}	

	public static void main(String[] args) {
		System.out.println(new TableofPythagoras(60).print());
	}
}
