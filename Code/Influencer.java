public class Influencer {

  //Instance variable
  private Trend[] popularTrend;   //A popular trend array

  // Constructor that uses createPopularTrend
  // Using it's information
  // to be the same as popularTrend
  public Influencer(String namesFile, String viewsFile, String likesFile, String revFile){
    popularTrend = createPopularTrend(namesFile, viewsFile, likesFile, revFile);
  }

  // No argument constructor
  // Sets the length of popularTrend as 0
  // Meaning it holds no information
  public Influencer(){
    popularTrend = new Trend[0];
  }

  // Makes a new array using the Trend[]
  // Named createPopularTrend
  // Using the namesFile, viewsFile, likesFile, and revFile
  // for the data of the new array
  public Trend[] createPopularTrend(String namesFile, String viewsFile, String likesFile, String revFile) {
    String[] names = FileReader.toStringArray(namesFile);
    int[] views = FileReader.toIntArray(viewsFile);
    int[] likes = FileReader.toIntArray(likesFile);
    String[] revenue = FileReader.toStringArray(revFile);
    Trend[] aTrend = new Trend[names.length];

    for(int i = 0; i < aTrend.length; i++){
      aTrend[i] = new Trend(names[i], views[i], likes[i], revenue[i]);
    }
    return aTrend;
  }

  // Uses bubble sorting method
  // Takes the first element to compare it
  // With the rest of the elements
  // Switching the position as it goes
  // Or stopping if it doesn't meet
  // The precondition

  // Sorts from least to greatest
  // Based on likes of a trend
  // and returns the name
  public Trend[] sortByLikeBubble() {
    Trend[] likesTrend = popularTrend;
    
    for (int i = 0; i < likesTrend.length - 1; i++) {
        for (int j = 0; j < likesTrend.length - i - 1; j++) {
            if (likesTrend[j].getLikes() > likesTrend[j + 1].getLikes()) {
                Trend temp = likesTrend[j];
                likesTrend[j] = likesTrend[j + 1];
                likesTrend[j + 1] = temp;
            }
        }
    }
    return likesTrend;
  }

  // Uses bubble sorting method
  // Takes the first element to compare it
  // With the rest of the elements
  // Switching the position as it goes
  // Or stopping if it doesn't meet
  // The precondition

  // Sorts from least to greatest
  // Based on views of a trend
  // and returns the trend
  public Trend[] sortByViewsBubble() {
    Trend[] viewsTrend = popularTrend;
    for(int i = 0; i < viewsTrend.length; i++){
      for(int j = 0; j < viewsTrend.length - i -1; j++){
        if(viewsTrend[j].getViews() > viewsTrend[j+1].getViews()){
          Trend temp = viewsTrend[j];
          viewsTrend[j] = viewsTrend[j+1];
          viewsTrend[j+1] = temp;
        }
      }
    }
    return viewsTrend;
  }  
}