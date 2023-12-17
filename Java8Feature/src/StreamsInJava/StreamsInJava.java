package StreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {

	public static void main(String[] args) {

		// using imperative approach
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += array[i];
			}
		}
		System.out.println(sum);

		// Stream
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
		System.out.println(sum2);

		List<String> list0 = Arrays.asList("apple", "banana", "cherry");
		Stream<String> newList = list0.stream();
		System.out.println(newList); // this will not print the values
		newList.forEach(System.out::println);// to print the list

		String[] array1 = { "apple", "banana", "cherry" };
		Stream<String> stream = Arrays.stream(array1);

		// Direct stream creation
		Stream<Integer> srrayStream = Stream.of(1, 2, 3);

		// Direct stream creation
		Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(20);
		limit.forEach(System.out::println);

		// Direct stream creation
		Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(5);
		limit1.forEach(System.out::println);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 34, 7654, 234, 76543, 765);
		List<Integer> filteList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filteList);
		List<Integer> mappedList = filteList.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(mappedList);
		System.out.println("------------");

		// or

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 34, 7654, 234, 76543, 765);
		List<Integer> filteList1 = list1.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
		System.out.println(filteList1);

		List<Integer> colect = Stream.iterate(0, x -> x + 1).limit(101).filter(x -> x % 2 == 0).map(x -> x / 10)
				.distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());
		System.out.println(colect);
	}

}
