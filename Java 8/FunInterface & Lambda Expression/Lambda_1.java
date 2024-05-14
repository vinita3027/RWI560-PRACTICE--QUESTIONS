package JDK8;
interface Drawable{

public void draw();
}
public class Lambda_1 {
	public static void main(String[] args) {  
		int a=1,b=2;
	Drawable d2 = ()->{ 
	System.out.println(a+b);
	};
	d2.draw();
	}
}
  