package demo2;

public class FactoryB implements ISubFactory, IFactoryB {

	@Override
	public String preProcess(String material) {
		return material + "-->Ԥ����";
	}

	@Override
	public String processB1(String semis) {
		return semis + "-->b1������Ʒ�ӹ�";
	}

	@Override
	public String processB2(String semis) {
		return semis + "-->b2������Ʒ�ӹ�";
	}

	@Override
	public String packaging(String product) {
		return product + "-->��װ��Ʒ";
	}
}
