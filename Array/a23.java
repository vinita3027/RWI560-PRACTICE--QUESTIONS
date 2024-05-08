class sample{
   public static void main(String[] args){
    int[][] a={
                new int[3],
                new int[2],
                null,
                new int[]{1,2,3}
               };
   System.out.println(a.length);
   System.out.println(a[2]);
   System.out.println(a[3][0]);
   System.out.println(a[3][1]);
   System.out.println(a[3][2]);
   System.out.println(a[0].length);
   System.out.println(a[1].length);
   System.out.println(a[3].length);
   }
}
