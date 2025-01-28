public class ComputeSimpleinterest {
	public double simpleInterest(double principal, double rate, double time) {
		double totalInterest;
		totalInterest = principal * rate * time / 100;
		return totalInterest;
	}
	
	public static void main(String[] args) {
		double principal, rate, time;
		Scanner input = new Scanner(System.in);
		principal = input.nextDouble();
		rate = input.nextDouble();
		time = input.nextDouble();
		ComputeSimpleinterest si = new ComputeSimpleinterest();
		double interest = si.simpleInterest(principal, rate, time);
		System.out.printf(“The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f”, interest, principal, rate, time);
		si.close();
		input.close();
	}
}