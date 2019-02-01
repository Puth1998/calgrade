package calgrade;

public class GradeDemo {

	public static void main(String[] args) {
		Input input = new Input();
		Process process;
		Output output = new Output();
		int score = input.inInt();
		process = new Process(score);
		output.print(process.calculate());
		
		}

}
