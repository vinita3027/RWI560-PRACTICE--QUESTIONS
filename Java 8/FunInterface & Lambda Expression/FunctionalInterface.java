package JDK8;

interface A{
	default void draw() {
		System.out.println("Draw it now");
	}
}
   
//@FunctionalInterface
interface B extends A{
	void graw(String msg);
}
public class FunctionalInterface implements B {
	public void graw(String msg) {
	System.out.println(msg);
}
	public static void main(String[]args) {
		FunctionalInterface f = new FunctionalInterface();
		f.graw("Heyy");
		f.draw();
	}

}
