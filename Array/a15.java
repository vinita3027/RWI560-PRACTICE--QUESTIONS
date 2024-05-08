class sample{
    public static void main(String[] args){
     int[] a={10,20,30};
     int[] b=new int[3];
     int[] c=new int[]{1,2,3};
     int[][] d={a,b,c};
     
     System.out.println(d[0][0]);
     System.out.println(d[0][1]);
     System.out.println(d[0][2]);
     System.out.println(d[1][0]);
     System.out.println(d[1][1]);
     System.out.println(d[1][2]);
     System.out.println(d[2][0]);
     System.out.println(d[2][1]);
     System.out.println(d[2][2]);
}
}