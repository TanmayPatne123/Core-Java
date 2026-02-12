package JavaFundamentalQuestions.streamAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(400);
		arrayList.add(30);
		arrayList.add(50);
		arrayList.add(70);
//		System.out.println(arrayList);
		
//		Stream<Integer> stream1 = arrayList.stream();
//		Stream<Integer> sorted = stream1.sorted();
//		Stream<Integer> map = sorted.map(n->n*2);
//		map.forEach(n->System.out.println(n));
//		System.out.println(map);
		
//		arrayList.stream()
//				.sorted()
//				.map(n->n*2)
//				.forEach(n->System.out.println(n));
		
		
	ArrayList<String> stringData = new ArrayList<>();
		
	stringData.add("Tanmay");
	stringData.add("Chinmay");
	stringData.add("tejas");
	stringData.add("Kunal");
		
	System.out.println(stringData);
		
	    Set<String> collect = stringData.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		List<String> collect2 = stringData.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);
	}

}
