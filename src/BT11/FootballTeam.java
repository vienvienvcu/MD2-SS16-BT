package BT11;

import java.util.Scanner;

public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void inputData(Scanner scanner){
        System.out.print("Enter team id: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter team name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter number of players: ");
        this.numberOfPlayer = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter team score: ");
        this.score = Integer.parseInt(scanner.nextLine());
    }
    public void outputData(){
        System.out.printf("%-20s %-20s %-20s %-20s\n", "id", "name", "number of player","score");
        System.out.printf("%-20s %-20s %-20s %-20s\n",this.id,this.name,this.numberOfPlayer,this.score);
    }
}
