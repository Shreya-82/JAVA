package unit2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2, 6, 7, 4, 10, 12, 35, 78);
		List<Integer> result = list1.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(result);
	}

}
