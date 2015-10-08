/* 
 * Project: Tester.java
 * Description: Tests Polygon.java, Circle.java, and Dice.java
 * Author: Seunghoon Park
 * Date: 8 October 2015
 */
public class Tester {
	public static void main(String args[]) {
		Polygon polygon = new Polygon(4);
		Circle circle = new Circle();
		Dice dice = new Dice();
		System.out.println(polygon.toString());
		System.out.println(circle.calcArea(3)); // static method can be calcArea(3);
		dice.rollDice();
		System.out.println(random);
	}
}