package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<=100;i++) {
			nums.add(i);
		}
		
		nums.forEach(n -> System.out.print(" "+n));
		System.out.println("Multiply by 5");
		//map
		List<Integer> multiplyBy5 = nums.stream().map(n -> n*5).collect(Collectors.toList());
		System.out.println(multiplyBy5);
		
		//filter
		List<Integer> divisibleby2  = nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(divisibleby2);

	}

}
