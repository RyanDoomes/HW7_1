public class SeperateDuplicates {
   public static void main(String[] args) {
      /*
      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));
      */
   }

   public static String seperateDuplicatesChars(String str) {
      char[] separated = str.toCharArray();
      String s1 = new String();
      for (int i = 0; i < separated.length; i++) {
         if (separated[i] == separated[i + 1]) {
            s1 = "I'm lost";
         }
      }
      return s1;

   }
}