import java.io.*;
class Sample{
   static void m1(Object a){
      Class c = a.getClass();
      System.out.println(c.getName());
   }
   public static void main(String[] args){
      int[] a = new int[3];
      m1("abc");
      m1(new Sample());
      m1(a);
   }
}