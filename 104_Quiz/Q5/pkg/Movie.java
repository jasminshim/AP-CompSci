package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue; 
    
public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRating = 33;
    revenue =  623357910;
}

public Movie(String m, double r, int n, int rev){
    movieName = m;
    rating = r;
    numRating = n;
    revenue = rev;
}

public void movieToString(){
    System.out.println("movie: " + movieName);
    System.out.println("rating: " + rating);
    System.out.println("number of ratings: " + numRating);
    System.out.println("revenue: " + revenue);
    return;
}

public String getMovieName(){
    return movieName;
}

public int getRevenue(){
    return revenue;
}

public void addRating(double r){
    double rates = numRating*rating;
    rating = ((rates + r)/(numRating+1));
    numRating = (numRating + 1);
}

public double getRating(){
    return rating;
}

public boolean compareRatings(Movie x){
    if(rating > x.getRating()){
        return true;
    }
    return false;
}
}
