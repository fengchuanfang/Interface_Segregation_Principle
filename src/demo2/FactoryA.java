package demo2;

public class FactoryA implements ISubFactory,IFactoryA{
	@Override
	public String preProcess(String material) {
		return material + "-->Ԥ����";
	}

	@Override
	public String processA1(String semis) {
		return semis + "-->a1������Ʒ�ӹ�";
	}

	@Override
	public String processA2(String semis) {
		return semis + "-->a2������Ʒ�ӹ�";
	}

	@Override
	public String packaging(String product) {
		return product + "-->��װ��Ʒ";
	}

}
