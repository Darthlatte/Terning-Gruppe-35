package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		faceValue = (int)(Math.random() * MAX) + 1;
	    return faceValue;	
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
