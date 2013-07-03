package domain;

public class Combination {

	private Gesture b;
	private Gesture a;

	public Combination(Gesture a, Gesture b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		Combination other = (Combination) obj;
		return (a.equals(other.a) && b.equals(other.b)) || (a.equals(other.b) && b.equals(other.a)) ;
	}
	
	@Override
	public int hashCode() {
		return a.hashCode() + b.hashCode();
	}
	
	@Override
	public String toString() {
		return a + " versus " + b;
	}

}
