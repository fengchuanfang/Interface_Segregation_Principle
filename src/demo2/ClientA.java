package demo2;

public class ClientA {
	public static void main(String[] args) {
		ISubFactory subFactory = new FactoryA();
		IFactoryA factory = new FactoryA();
		String semis1 = subFactory.preProcess("‘≠¡œ");
		String semis2 = factory.processA1(semis1);
		String product = factory.processA2(semis2);
		System.out.println(subFactory.packaging(product));
	}

}
