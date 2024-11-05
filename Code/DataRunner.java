 import java.util.Scanner;
import java.util.Arrays;

public class DataRunner {
  public static void main(String[] args) {

    // Makes a new array by using influencer to create a popular trend array
    // via the txt files
    // System goes through every trend and prints out it's corresponding data
    System.out.println("Initial Trend Data" + "\n");
    Influencer influencer = new Influencer("names.txt", "views.txt", "likes.txt", "rev.txt");
    Trend[] trends = influencer.createPopularTrend("names.txt", "views.txt", "likes.txt", "rev.txt");

    for (Trend trend: trends){
      System.out.println(trend);
    }

    System.out.println("---------------------" + "\n");

    // Makes a likesTrend array by using the influencer
    // to sort out the trends by likes
    // The system uses Arrays.toString to convert
    // the likesTrend into something the system
    // can print
    System.out.println("Sort By Likes" + "\n");
    Trend[] likesTrend = influencer.sortByLikeBubble();

    System.out.println(Arrays.toString(likesTrend));
    

    System.out.println("-------------------" + "\n");

    // Creates a new trend, viewsTrend, by using the influencer
    // to sort the trend by views
    // the viewsTrend is then converted to
    // a string so that the system can return it
    System.out.println("Sort By Views" + "\n");
    Trend[] viewsTrend = influencer.sortByViewsBubble();

    System.out.println(Arrays.toString(viewsTrend));
    
     System.out.println("-------------------" + "\n");

    // System prints a no argument constructor
    // method of influencer
    System.out.println("No-Argument Constructor" + "\n");
    Influencer m = new Influencer();
    System.out.println(m);
    
  }
}