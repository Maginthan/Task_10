package task10Package;

public class Q7Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating array of Tea objects
		Tea[] teaArray = new Tea[4];

		// Creating instances of Tea and sub classes
		teaArray[0] = new Tea();
		teaArray[0].prepareTea();
		teaArray[1] = new BlackTea();
		teaArray[1].prepareTea();
		teaArray[2] = new GreenTea();
		teaArray[2].prepareTea();
		teaArray[3] = new HerbalTea();
		teaArray[3].prepareTea();

	}

}
