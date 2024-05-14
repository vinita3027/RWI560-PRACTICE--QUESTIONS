package JDK8;

import java.util.function.Predicate;

public class Main {
	public static void main(String[]args) {
		Predicate<String> startsWithLetterP = x -> x.toLowerCase().charAt(0) == 'P';

		Predicate<String> endsWithLetteri = x -> x.toLowerCase().charAt(x.length()-1) == 'i';

		Predicate<String> or = startsWithLetterP.or(endsWithLetteri);

		//System.out.println(or.test("Preeti"));
		
		//System.out.println(startsWithLetterP.negate().test("Preeti"));
		
		Predicate<String> and = startsWithLetterP.and(endsWithLetteri);
		
		System.out.println(and.test("Preeti"));
	}
		}

