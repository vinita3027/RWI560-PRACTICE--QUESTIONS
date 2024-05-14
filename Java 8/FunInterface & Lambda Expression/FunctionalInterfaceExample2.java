package JDK8;

interface Square {
	int calculate(int x);
}

public class FunctionalInterfaceExample2 {

	public static void main(String args[])
	{
		int a = 5;

		//  using lambda expression to define the calculate method
		Square s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}

