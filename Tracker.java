import java.io.Console;

public class Tracker {
  public static void main(String[] args) {
    Console c = System.console();
    int day1 = Integer.parseInt(c.readLine("How many hours of coding practice did you get today? "));
    int day2 = Integer.parseInt(c.readLine("How many hours of coding practice did you get yesterday? "));
    int day3 = Integer.parseInt(c.readLine("How many hours of coding practice did you get day-before-yesterday? "));
    int total = day1+day2+day3;
    if(total>15) {
      System.out.println(total + " hours is fantastic, you are sure to be a great programmer!");
    } else if(total>3) {
      System.out.println(total + " hours is very good. Keep it up!");
    } else if (total>0) {
      System.out.println(total + " hours is not that much, but at least you tried.");
    } else {
      System.out.println("Maybe you should consider a different career.");
    }

  }
}
