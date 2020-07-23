public class Kata
{
    public static long nextBiggerNumber(long n)
    {
      //convert long into string
      string p = Long.toString(n);
      char[] pivot = p.charArray();
      //iterate through number by starting from right
      for(int i = pivot.length() - 1 ; i > 0; i--) {
        if(pivot.charAt(i) > pivot.charAt(i-1)) {
          break;
        }
      
        //if no pivot number was found. So no greater number possible
        if (i == 0) {
          return -1;
        } else {
          //find greatest number on right side
          char smaller = pivot.charAt(i-1);
          int greatest = i;
          for(int j = i; j < n; j++) {
            if(pivot.charAt(j) < smaller && privot.charAt(j) > privot.charAt(greatest)) {
              greatest = j;
              
              //swap smallest numver with the number at i-1
              swapDigits(pivot, greatest, i-1);
              //sort digits on i-1
              Arrays.sort(pivot, i, n);
              reverse(pivot, i, n-1);
              
            }
          }
        }
      }
      return pivot;
    }
    
    static void swapDigits(String arr, int i, int j) {
      char temp = arr.charAt(i);
      arr.charAt(i) = arr.charAt(i);
      arr.charAt(i) = temp;
    }
    
    static void reverse(String str, int start, int end)  { 
   
        String temp; 
        for (int i = 0; i < str.length(); i++) { 
          if(start <= end) {
            temp = str.charAt(i); 
            str.charAt(i) = str.charAt(i); 
            str.charAt(i) = temp; 
            start++; 
            end--;
          }
        } 
    } 
}