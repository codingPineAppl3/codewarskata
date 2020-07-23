import java.io.*;
public class School{

  public static int getAverage(int[] marks){
  int count = 0, sum = 0, average = 0;
    for(int m : marks) {
      sum += m;
      ++count;
    }
    average = sum / count;
    return average;
  }

}