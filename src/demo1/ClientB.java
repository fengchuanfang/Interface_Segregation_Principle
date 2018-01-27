package demo1;

public class ClientB {

	public static void main(String[] args) {
		IFactory factory = new FactoryB();
		String semis1 = factory.preProcess("‘≠¡œ");
		String semis2 = factory.processB1(semis1);
		String product = factory.processB2(semis2);
		System.out.println(factory.packaging(product));
	}

}
