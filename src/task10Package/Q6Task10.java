package task10Package;

public class Q6Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea obj = new Tea();
		obj.prepareTea();

		BlackTea obj1 = new BlackTea();
		obj1.prepareTea();

	}

}

//Creating sub classes of parent class Tea
class BlackTea extends Tea {
	public void prepareTea() {
		System.out.println("A method that prepares a black tea with hot water and tea leaves");
	}

}

class GreenTea extends Tea {
	public void prepareTea() {
		System.out.println("A method that prepares a green tea with hot water and green tea leaves");
	}

}

class HerbalTea extends Tea {
	public void prepareTea() {
		System.out
				.println("A method that prepares a herbal tea with hot water and ingrdients like ginder and cinnnamon");
	}
}