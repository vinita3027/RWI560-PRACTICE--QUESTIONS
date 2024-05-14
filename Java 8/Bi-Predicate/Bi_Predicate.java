package jdk8;

import java.util.function.BiPredicate;
public class Bi_Predicate {
	public static void main(String[]args) {
		BiPredicate<String,Integer> biPredicate = (str,x) -> str.length() == x;
		System.out.println(biPredicate.test("Preeti",6));
	}

}
