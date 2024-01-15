package storemanagement;

public class BuiltInCabinet extends Cabinet{

    private boolean isBuiltIn;
    public BuiltInCabinet(){
        super();
    }



    public BuiltInCabinet(String fname, String name, double price, boolean hasHinges, boolean isBuiltIn){
        super(fname, name, price, hasHinges);
        this.isBuiltIn=isBuiltIn;
    }
    public boolean getIsBuiltIn(){
        return isBuiltIn;
    }

    public String toString(){


        return super.toString() + "\n" + "Cabinet built in? " + isBuiltIn;
    }




}