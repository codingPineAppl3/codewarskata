public class SimplePrimeStreaming {
    public static String solve(int a, int b) {

        String primes = "23";
        for (int p = 4; p < 60000; p++) {           
          int counter=0;      
          for(int num =2; num<=Math.sqrt(p); num++) {
            if(p%num==0) {
              counter++;
            }
           }
          if (counter == 0) {
            //Appended the Prime number to the String
            primes = primes.concat(String.valueOf(p));
            
          } 
        } 
      return primes.substring(a, a + b); 
  }
}