public class TestReverse {
   public static void main(String[] args) {

      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverse("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));


   }

   public static boolean isExactReverse(String x, String y) {
      char[] charArrayX = x.toCharArray();
      char[] charArrayY = y.toCharArray();


      if (charArrayX.length != charArrayY.length)
      {
         return false;
      }
         for (int i = 0, j = charArrayY.length-1; i < charArrayX.length && j>=0; i++, j--)
         {
            if (charArrayX[i]!=charArrayY[j]){
               return false;
            }
         }
            return true;


      }
}