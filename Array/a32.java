class sample{
   
    static void displayEven(int[] a){
     for(int x:a){
       if(x%2==0)
         System.out.println(" "+x);
     }
  }
    public static void main(String[] args){
               int[] a={1,2,4,6,5,7};
               displayEven(a);
}
}