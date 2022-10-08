public class FindMaxmin {
   public int max(int [] array) {
      int max = 0;
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
   public int min(int [] array) {
      int min = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }
   public static void main(String args[]) {
      int[] myArray = {1,7,2,8,20,5};
      FindMaxmin m = new FindMaxmin();
      System.out.println("Maximum value in the array is:: "+m.max(myArray));
      System.out.println("Minimum value in the array is:: "+m.min(myArray));
   }
}