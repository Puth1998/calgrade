package calgrade;

public class Process {
	int score;

	public Process(int score) {
		this.score = score;
	}
	
	public char calculate() {
		char grade;
		if( score >= 80 ) {
			grade = 'A';
		}else if ( score >= 70 ) {
			grade = 'B';
		}else if ( score >= 60 ) {
			grade = 'C';
		}else if ( score >= 50 ) {
			grade = 'D';
		}else
			grade = 'F';
		return grade;
	}

}
