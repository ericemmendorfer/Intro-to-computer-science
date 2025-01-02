import java.util.Date;

class House{
	//define variables
	public String area;
	public Date yearBuilt;

	//mutators

	public void setArea(String area){
		this.area=area;

	}
	   public String getArea() {
        return area;
    }

	public void setYearBuilt(Date yearBuilt){
		this.yearBuilt=yearBuilt;

	}
	 public Date getYearBuilt() {
        return yearBuilt;
    }


}



class RanchHouse extends House implements Liveble{

}
class ColonialHouse extends House implements Liveble{
	ColonialHouse(){}

	public void setStories(int stories){
		this.stories=stories;

	}
	   public int getStories() {
        return stories;
    }
    ColonialHouse(String area, Date yearBuilt, int stories){
    	super (area,yearBuilt,stories);

    }
}
   
  
