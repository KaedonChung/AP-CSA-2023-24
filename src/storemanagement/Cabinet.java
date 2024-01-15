package storemanagement;
public class Cabinet extends Furniture{

    private boolean hasHinges;
    public Cabinet(){
        super();
    }



    public Cabinet(String fname, String name, double price, boolean hasHinges){
        super(fname, name, price);
        this.hasHinges=hasHinges;
    }
    public boolean getHasHinges(){
        return hasHinges;
    }

    public String toString(){


        return super.toString() + "\n" + "Cabinet has Hinges? " + hasHinges;
    }




}