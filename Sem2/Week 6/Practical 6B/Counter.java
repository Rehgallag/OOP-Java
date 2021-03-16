public class Counter {
   private int count;
    
   public Counter() {
      count = 0;
   }
    
   public int click(){
      count = count + 1;
      
      return count;
   }
    
   public int getCount(){
      return count;     
   }
    
   public int reset() {
      count = 0;
      return count;
   }
    
}