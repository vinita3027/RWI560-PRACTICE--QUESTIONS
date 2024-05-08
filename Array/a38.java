class Sample{
    public static void main(String[] args){
           int[] a= new int[5];
           int[] b= new int[3];

           System.out.println(a.toString());
           System.out.println(b.toString());

           System.out.println(a.hashCode());
           System.out.println(b.hashCode());

           System.out.println(a==b);
           System.out.println(a.equals(b));
           }
}