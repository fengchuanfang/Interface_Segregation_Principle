package demo1;

public class FactoryB implements IFactory {

	@Override
	public String preProcess(String material) {
		return material + "-->预处理";
	}

	@Override
	public String processA1(String semis) {
		return null;
	}

	@Override
	public String processA2(String semis) {
		return null;
	}

	@Override
	public String processB1(String semis) {
		return semis + "-->b1工序半成品加工";
	}

	@Override
	public String processB2(String semis) {
		return semis + "-->b2工序半成品加工";
	}

	@Override
	public String packaging(String product) {
		return product + "-->包装成品";
	}

}