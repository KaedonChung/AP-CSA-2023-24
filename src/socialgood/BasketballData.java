package socialgood;

import java.io.IOException;
import java.util.Scanner;

public class AdvertisingSpecialistConsole {
    public static void main(String[] args) throws IOException {
        // Instantiate Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Instantiate FileRead to read data from files
        FileRead fileRead = new FileRead();

        // Read data from files
        String[] teamsArray = fileRead.getStringData(30, "teams.txt");
        String[] locationsArray = fileRead.getStringData(30, "locations.txt");
        String[] arenasArray = fileRead.getStringData(30, "arenas.txt");
        String[] capacitiesArray = fileRead.getStringData(30, "capacities.txt");
        String[] championshipsArray = fileRead.getStringData(30, "championships.txt");

        // Instantiate BasketballData class with the read data
        BasketballData basketballData = new BasketballData(teamsArray, locationsArray, arenasArray, capacitiesArray, championshipsArray);

        // Print general information about basketball data
        System.out.println(basketballData);

        // Prompt user for input
        System.out.println("\nEnter a team name to get information about their stadium:");
        String userInput = scanner.nextLine();

        // Get and print information about the specified team's stadium
        String stadiumInfoByUserInput = basketballData.getStadiumInfoByTeam(userInput);
        System.out.println("Stadium information for " + userInput + ":\n" + stadiumInfoByUserInput);


        scanner.close();
    }
}