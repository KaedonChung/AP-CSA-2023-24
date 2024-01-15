package storemanagement;

public class WaterBed extends Bed{

    private boolean isWaterBed;
    public WaterBed(){
        super();
    }



    public WaterBed(String fname, String name, double price, boolean hasSprings, boolean isWaterBed){
        super(fname, name, price, hasSprings);
        this.isWaterBed=isWaterBed;
    }
    public boolean getWaterBed(){
        return isWaterBed;
    }

    public String toString(){


        return super.toString() + "\n" + "Is a waterbed? " + isWaterBed;
    }




}