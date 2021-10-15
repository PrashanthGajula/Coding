package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<=100;i++) {
			nums.add(i);
		}
		
//		Collections.sort(nums, (a,b) -> {
//			return b-a;
//		});
		Collections.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		
		nums.forEach(n -> System.out.print(" "+n));
		System.out.println("\n Multiply by 5");
		//map
		List<Integer> multiplyBy5 = nums.stream().map(n -> n*5).collect(Collectors.toList());
		System.out.println(multiplyBy5);
		
		System.out.println("Divisible by 2");
		//filter
		List<Integer> divisibleby2  = nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(divisibleby2);
		


	}

}
