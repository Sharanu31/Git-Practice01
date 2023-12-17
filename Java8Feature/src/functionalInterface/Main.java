package functionalInterface;

@FunctionalInterface
public interface Main {

	public void hello();

//	public void hello1(); // by another abstract method @functionalinterface will throw an error 

	default void byby() {

	}

	static void morning() {

	}
}
