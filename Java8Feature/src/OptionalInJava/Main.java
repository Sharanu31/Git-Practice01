package OptionalInJava;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		// Optional.of
		Optional<String> name = getName(1);
		if (name.isPresent()) {
			System.out.println(name.get());
		}

		name.ifPresent(System.out::println);

		// Optional.ofNullable

		Optional<String> name1 = getName(2);
		if (name1.isPresent()) {
			System.out.println(name1.get());
		}
		name1.ifPresent(System.out::println);

		// Optional.empty()

		Optional<String> name2 = getName(2);
		if (name2.isPresent()) {
			System.out.println(name2.get());
		}
		name2.ifPresent(System.out::println);

		// if name reutrn null

		// String nametoUse = name.isPresent() ? name.get() : "NA";

		// we also write line no 35 in other way

		// String nametoUse = name.orElse("NA");

		// or we can write line no 39 in other way

		// String nametoUse = name.orElseGet(() -> "NA");

		// or we can write line no 39 in other way

		String nametoUse = name.orElseThrow(() -> new NoSuchElementException());

		System.out.println(nametoUse);

		Optional<String> optional = getName(1);
		Optional<String> optional1 = optional.map(x -> x.toLowerCase());
		System.out.println(optional1);

		System.out.println(optional1.get());

		optional.ifPresent(System.out::println);
	}

	private static Optional<String> getName(int id) {
		String name = "Sharanu";
		if (id == 2) {
			name = null;
			return Optional.ofNullable(name);
		} else if (id == 3) {
			name = null;
			return Optional.empty();
		}
		return Optional.of(name);
	}

}
