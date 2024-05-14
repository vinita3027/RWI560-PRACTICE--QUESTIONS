package jdk8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Bi_Function {
	public static void main(String[]args) {
    Function<String,Integer> function = str -> str.length();
    BiFunction<String,String,Integer> biFunction = (x,y) -> x.length() + y.length();
    System.out.println(biFunction.apply("Hi","Hello"));

	}
}
