

public class neuron {
	private double[] inputs;
	private double[] weights;
	private double retention;
	public neuron(int input, double retent, double[] weight) {
		retention = retent;
		inputs = new double[input];
		weights = new double[input];
		weights = weight;
	}
	public neuron() {
		retention = .2;
		inputs = new double[2];
		weights = new double[2];
		weights[0] = .5;
		weights[1] = -.5;
	}
	public int fire(double x) {
		int res = x > 0 ? 1 : -1;
		return res;
	}
	public double sum() {
		double sum = 0.0;
		for(int i = 0;  i < inputs.length; i++) {
			sum += inputs[i] * weights[i];
		}
		return sum;
	}
	public double sum(double[] input) {
		double sum = 0.0;
		for(int i = 0; i < input.length; i++) {
			sum += input[i] * weights[i];
		}
		return sum;
	}
	public void train(double[] input, int expected) {
		for(int i = 0; i < input.length; i ++) {
			inputs[i] = input[i];
		}
		double error = (double)expected - fire(sum());
		for(int i = 0; i < weights.length; i++) {
			weights[i] += error * inputs[i] * retention;
		}
	}	
}
