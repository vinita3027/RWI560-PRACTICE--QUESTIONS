class Sample{
   static void display(int[][] a){
     for(int[] row:a)
        for(int item:row)
       System.out.println(" "+item);
     System.out.println();
    }
public static void main(String[] args){
    int[][] a= {
               {1,2,3},
               {5,6},
               {0,0,0,0,0},
               {10,20,30,40,50}
              };
    display(a);
  }
}