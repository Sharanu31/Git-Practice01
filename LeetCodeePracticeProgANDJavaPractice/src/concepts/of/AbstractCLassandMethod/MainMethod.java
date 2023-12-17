package concepts.of.AbstractCLassandMethod;

class SeconDclass extends SampleAbstractClassOne {

	@Override
	String AccountName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String AccountNameFROMSecondAbstract() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Random extends SeconDclass {

	@Override
	String AccountName() {
		// TODO Auto-generated method stub
		return super.AccountName();
	}

}

public class MainMethod {
	public static void main(String[] args) {
		SeconDclass sec = new SeconDclass();
		sec.AccountHolder();
		System.out.println(sec.AccountName());
		SampleAbstractClassOne.count();
	}

}
