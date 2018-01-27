package demo2;

public class ClientB {
	public static void main(String[] args) {
		ISubFactory subFactory = new FactoryB();
		IFactoryB factory = new FactoryB();
		String semis1 = subFactory.preProcess("‘≠¡œ");
		String semis2 = factory.processB1(semis1);
		String product = factory.processB2(semis2);
		System.out.println(subFactory.packaging(product));
	}

}
