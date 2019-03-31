package pkg;

public class tester {
	public static void main(String args[]) {
		
		neuron machine = new neuron();
		
		double[] data = new double[2];
		for(int i = 0; i < 10; i++) {
			for(int x = 0; x < 10; x++) {
				data[0] = i;
				data[1] = x;
				if(x > i) {
					machine.train(data, 1);
				}else{
					machine.train(data, -1);
				}
			}
		}
		double[] input = {1.0,73.0};
		System.out.println(machine.fire(machine.sum(input)));
		
	}
}
