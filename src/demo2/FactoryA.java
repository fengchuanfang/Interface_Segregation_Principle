package demo2;

public class FactoryA implements ISubFactory,IFactoryA{
	@Override
	public String preProcess(String material) {
		return material + "-->预处理";
	}

	@Override
	public String processA1(String semis) {
		return semis + "-->a1工序半成品加工";
	}

	@Override
	public String processA2(String semis) {
		return semis + "-->a2工序半成品加工";
	}

	@Override
	public String packaging(String product) {
		return product + "-->包装成品";
	}

}
