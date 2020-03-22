
class Student extends Inheritance {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	public char calculate() {
		int avg = 0;
		for (int i = 0; i < testScores.length; i++) {
			avg += testScores[i];
		}
		avg = avg / testScores.length;
		if (avg < 40) {
			return 'T';
		} else if (avg >= 40 && avg <= 55) {
			return 'D';
		} else if (avg >= 55 && avg < 70) {
			return 'P';
		} else if (avg >= 70 && avg < 80) {
			return 'A';
		} else if (avg >= 80 && avg < 90) {
			return 'E';
		} else {
			return 'O';
		}
	}
	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here
}

class Inheritance {
	private String firstName;
	private String lastName;
	private int id;
	private int[] scores;

	Inheritance(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

}
