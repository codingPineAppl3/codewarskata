public class Kata {

  public static char triangle(final String row) {
    
    if(row.length() == 1) return row.charAt(0);
    String nextRow = ""; //next row
    for(int i = 1; i < row.length(); i++) {
      char c1 = row.charAt(i), c2 = row.charAt(i-1);
      switch(c2) {
        case 'R': nextRow += c1 == 'R'?'R' : c1 == 'G'?'B':'G'; break;
        case 'G': nextRow += c1 == 'R'?'B' : c1 == 'G'?'G':'R'; break;
        case 'B': nextRow += c1 == 'R'?'G' : c1 == 'G'?'R':'B'; break;
      }
    }
    
    return triangle(nextRow);
  }
  
}