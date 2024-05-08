class sample{
    public static void main(String[] args){
          int[] a=new int[5];
          int[] b=a;
          a[0]=5;
          b[1]=6;
          a=new int[3];
          System.out.println(a[0]);
          System.out.println(a[1]);
          System.out.println(b[0]);
          System.out.println(b[1]);
          
          }
}