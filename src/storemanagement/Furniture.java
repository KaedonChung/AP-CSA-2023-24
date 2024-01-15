package storemanagement;

public class Furniture{
    private String name;
    private double price;
    private String fname;

    public Furniture(){
        name="";
        price=0.0;
        fname="";
    }
    public Furniture(String fname, String name, double price){
        this.name=name;
        this.price=price;
        this.fname=fname;
    }

    public String getName(){
        return name;
    }
    public String getFname(){
        return fname;
    }
    public void setFname(String fname){
        this.fname=fname;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String toString(){
        return "Your " + fname + ", called " + name + " , costs $" + price +".";
    }






}