package storemanagement;

public class Bed extends Furniture{
    private boolean hasSprings;

    public Bed(){
        super();
    }



    public Bed(String fname, String name, double price, boolean hasSprings){
        super(fname, name, price);
        this.hasSprings=hasSprings;
    }
    public boolean getHasSprings(){
        return hasSprings;
    }

    public String toString(){


        return super.toString() + "\n" + "Bed has Springs? " + hasSprings;
    }





}