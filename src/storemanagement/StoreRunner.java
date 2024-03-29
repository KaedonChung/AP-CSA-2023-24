package storemanagement;
import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        // Creates a Scanner object - feel free to delete if not using!
        Scanner input = new Scanner(System.in);
        // instantiate variables
        String name;
        double price;
        int choseFurniture;
        String fName;
        String fBool;
        boolean isLN=false;
        int YN;
        int ln;


        //Scanners to collect data
        System.out.println("Are you creating a Bed or Cabinet? Enter 1 for Bed and 2 for Cabinet.");

        choseFurniture=input.nextInt();

        if (choseFurniture == 1){
            System.out.println("What is your Bed called?");
            name=input.next();
            System.out.println("Is your Bed a waterbed? Type 1 for Yes and 2 for No.");
            ln=input.nextInt();
            if(ln==1){
                isLN=true;
            }
            fName="Bed";
            fBool = "Springs";
        }else{
            System.out.println("What is your Cabinet called?");
            name=input.next();
            fName= "Cabinet";
            fBool = "Hinges";
            System.out.println("Is your Cabinet built in? Type 1 for Yes and 2 for No.");
            ln=input.nextInt();
            if(ln==1){
                isLN=true;
            }
        }

        System.out.println("How expensive is your "+ fName +"? Enter with a decimal point and without the $ sign.");
        price=input.nextDouble();


        System.out.println("Does your " + fName + " have " + fBool + "? Enter 1 for Yes and 2 for No.");
        YN=input.nextInt();


        if(YN == 1){
            if(choseFurniture==1){
                WaterBed B = new WaterBed(fName, name, price, true,isLN);
                System.out.println(B.toString());
            }else{
                BuiltInCabinet C = new BuiltInCabinet(fName, name, price, true,isLN);
                System.out.println(C.toString());
            }
        }else{
            if(choseFurniture==1){
                WaterBed B = new WaterBed(fName, name, price, false,isLN);
                System.out.println(B.toString());
            }else{
                BuiltInCabinet C= new BuiltInCabinet(fName, name, price, false, isLN);
                System.out.println(C.toString());
            }
        }

        // Closes the Scanner object
        input.close();
    }
}

