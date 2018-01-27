package demo1;

public interface IFactory {
	String preProcess(String material);

	String processA1(String semis);

	String processA2(String semis);

	String processB1(String semis);

	String processB2(String semis);

	String packaging(String product);
}
