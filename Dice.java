// Dice.java
public class Dice {
	public Dice() {}
	public int rollDice() {
		double random = Math.random();
		System.out.println(random);
		random *=6;
		random = ceiling();
		return (int) random;
	}
}