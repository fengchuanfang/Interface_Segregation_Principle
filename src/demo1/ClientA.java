package demo1;

public class ClientA {
	public static void main(String args[]) {
		IFactory factory = new FactoryA();
		String semis1 = factory.preProcess("‘≠¡œ");
		String semis2 = factory.processA1(semis1);
		String product = factory.processA2(semis2);
		System.out.println(factory.packaging(product));
	}
}
