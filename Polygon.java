// Polygon.java
public class Polygon {
	private int numSides;

	public Polygon() {
		this.numSides = 0;
	}
	public Polygon(int x) {
		this.numSides = x;
	}
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int x) {
		this.numSides = x;
	}
	public String toString() {
		String num;
		switch(numSides) {
			case 1: 
				num = "one";
				break;
			case 2: 
				num = "two";
				break;
			case 3: 
				num = "three";
				break;
			case 4: 
				num = "four";
				break;
			case 5: 
				num = "five";
				break;
			case 6: 
				num = "six";
				break;
			case 7: 
				num = "seven";
				break;
			case 8: 
				num = "eight";
				break;
			default:
				num = "too many";
		}
		return "Your polygon has " + num + " sides.";
	}
}