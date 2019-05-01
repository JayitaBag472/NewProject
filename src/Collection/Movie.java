package Collection;

public class Movie implements Comparable<Movie>
	{
	    private double rating;
	    private String name;
	    private int year;
	    
	    public int compareTo(Movie m){
	    	return this.year = m.year;
	    			}
	    public Movie(double rm,String nm,int yr){
	    	this.rating= rm;
	    	this.name= nm;
	    	this.year= yr;
	    	
	    	
	    }
	    
	    public  double getRating(){
	    	return rating;
	    }
	    public String getName(){
	    	return name;
	    }
	    
	    public int getYear(){
	    	return year;
	    }
	    
	    
	    
	    }