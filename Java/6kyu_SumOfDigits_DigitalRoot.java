public class DRoot {
  public static int digital_root(int n) {
    //StringBuilder sb = intToStringBuilder(n);
    int sum = 0;

    for(int i = 0; i < intToStringBuilder(n).length(); i++) {
        sum = sum + Integer.parseInt(String.valueOf(intToStringBuilder(n).charAt(i))); 
        if(i+1 != intToStringBuilder(n).length()) {
          digital_root(sum);
        }
    }
    


    return sum;
  }
  
  public static StringBuilder intToStringBuilder(int n) {
    String digits =  Integer.toString(n);
    StringBuilder sb = new StringBuilder(digits);
    return sb;
  }
}