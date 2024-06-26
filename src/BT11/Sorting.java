package BT11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
   public static  List <FootballTeam> footballTeams = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("***********Menu FootballTeam******************");
            System.out.println("1. add");
            System.out.println("2. show");
            System.out.println("3. sort insert by of sorted team");
            System.out.println("4. sort bubble sorted team");
            System.out.println("5. sort selection sorted team");
            System.out.println("6. exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    inputAdd(scanner);
                    break;
                case 2:
                    displayShow();
                    break;
                case 3:
                    sortInsertion( footballTeams);
                    displayShow();
                    break;
                case 4:
                    sortBubble(footballTeams);
                    displayShow();
                    break;
                case 5:
                    sortSelection(footballTeams);
                    displayShow();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice 1-4");
            }

        }while (true);
    }
    public static void inputAdd(Scanner scanner){
        System.out.print("Enter team number: ");
        int teamNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teamNumber; i++){
          FootballTeam teams = new FootballTeam();
          teams.inputData(scanner);
          footballTeams.add(teams);
        }

    }
    public static void displayShow(){
       for (FootballTeam team : footballTeams){
           team.outputData();
       }
    }

    public static void sortInsertion(List <FootballTeam> footballTeams ){
        for (int i = 1; i < footballTeams.size(); i++) {
            int key = footballTeams.get(i).getScore();
            int j = i - 1;
            while (j >= 0 && footballTeams.get(j).getScore()> key) {
                footballTeams.get(j+1).setScore(footballTeams.get(j).getScore());
                j--;
            }
            footballTeams.get(j+1).setScore(key);
        }

    }
    public static void sortSelection(List<FootballTeam> footballTeams){
        for (int i = 0; i < footballTeams.size(); i++) {
            for (int j = 0; j < footballTeams.size()-i-1; j++) {
                if (footballTeams.get(j).getScore() > footballTeams.get(j+1).getScore()) {
                    int temp = footballTeams.get(j).getScore();
                    footballTeams.get(j).setScore( footballTeams.get(j+1).getScore());
                     footballTeams.get(j+1).setScore(temp);
                }
            }
        }

    }
    public static void sortBubble(List<FootballTeam> footballTeams) {
        for (int i = 0; i < footballTeams.size(); i++) {
            for (int j = 0; j < footballTeams.size() - i - 1; j++) {
                if (footballTeams.get(j).getScore() > footballTeams.get(j + 1).getScore()) {
                    int temp = footballTeams.get(j).getScore();
                    footballTeams.get(j).setScore(footballTeams.get(j + 1).getScore());
                    footballTeams.get(j + 1).setScore(temp);
                }
            }
        }
    }
}
