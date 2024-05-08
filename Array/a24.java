class sample{
  public static void main(String[] args){
   int a[]={1,2,3};
   int b[]={5,6,7};
   int c[][]={new int[2],b,null,new int[3]};
   c[2]=a;
   System.out.println(c.length);
   System.out.println(c[0]);
   System.out.println(c[1]);
   System.out.println(c[2]);
   System.out.println(c[3]);
   System.out.println(c[2][0]);
   System.out.println(c[2][1]);
   System.out.println(c[2][2]);
   System.out.println(c[1][0]);
   System.out.println(c[1][1]);
   System.out.println(c[1][2]);
}
}