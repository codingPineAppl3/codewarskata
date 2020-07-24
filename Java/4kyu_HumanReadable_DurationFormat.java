import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeFormatter {
  
  enum TimeFormat {
        YEAR(365*24*60*60),
        DAY(24*60*60),
        HOUR(60*60),
        MINUTE(60),
        SECOND(1);
    
    private int seconds;
    private TimeFormat(final int seconds) {
      this.seconds = seconds;
    }
    
    public int getSeconds() {
      return seconds;
    }
 }
    
    public static String formatDuration(int seconds) {

      int rest = seconds;
      
      if(seconds == 0) 
        return "now";
      Map<TimeFormat, Integer> amount = new EnumMap<>(TimeFormat.class);
      
      for(TimeFormat t : TimeFormat.values()) {
        amount.put(t, rest / t.getSeconds());
        rest = rest % t.getSeconds();
      }
      String collect = amount.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .map(e -> e.getValue() + " " + e.getKey().toString().toLowerCase() + (e.getValue() > 1 ? "s" : ""))
                .collect(Collectors.joining(", "));
        return collect.replaceFirst(", (?!.*,)", " and ");
    }
}