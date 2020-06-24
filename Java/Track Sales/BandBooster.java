public class BandBooster
{ 
    private String name;
    private int boxesSold;
    public BandBooster (String boosterName) {
        boxesSold = 0;
        name = boosterName;
    }
    
    public String getName(){
    return name;
    }
    
    public double updateSales(double additionalboxes){
    return boxesSold += additionalboxes;
    }
    
    public String toString(){
    return name + ": " + boxesSold + " boxes";
    }
}

