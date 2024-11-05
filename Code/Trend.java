public class Trend{
  //Instance variables
  private int views;    // Amount of views of a trend
  private int likes;    // Amount of likes of a trend
  private String rev;   // Revenue for a trend
  private String name;  // Name of the trend

  
  // Description of a trend including
  // name, views, likes, and revenue
  public Trend(String name, int views, int likes, String rev){
    this.name = name;
    this.views = views;
    this.likes = likes;
    this.rev = rev;
  }

  // Name accessor method
  public String getName() {
    return name;
  }

  //Views accessor method
  public int getViews() {
    return views;
  }

  //Likes accessor method
  public int getLikes() {
    return likes;
  }

  //Revenue accessor method
  public String getRev() {
    return rev;
  }

  // To string method
  // Uses the information of a trend
  // In a format
  public String toString(){
    return name + "\nLikes: " + likes + "\nRev: $" + rev + "\nViews: " + views + "\n";
  }
}