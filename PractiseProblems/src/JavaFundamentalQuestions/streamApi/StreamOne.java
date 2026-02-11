package JavaFundamentalQuestions.streamApi;

import java.util.ArrayList;
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
		System.out.println(arrayList);
		
//		Stream<Integer> stream1 = arrayList.stream();
//		Stream<Integer> sorted = stream1.sorted();
//		Stream<Integer> map = sorted.map(n->n*2);
//		map.forEach(n->System.out.println(n));
//		System.out.println(map);
		
		arrayList.stream()
				.sorted()
				.map(n->n*2)
				.forEach(n->System.out.println(n));
		
	}

}
