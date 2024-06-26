package BT14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingStudent {
   public static List <Student> students = new ArrayList<>();
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
                        sortInsertion(students);
                        displayShow();
                        break;
                    case 4:
                        sortBubble(students);
                        displayShow();
                        break;
                    case 5:
                        sortSelection(students);
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
    public static void inputAdd(Scanner scanner) {
        System.out.println("Enter number student information: ");
        int studentNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentNum; i++) {
            Student student = new Student();
            student.inputData(scanner);
            students.add(student);
        }
    }
    public static void displayShow() {
        for (Student student : students) {
            student.displayData();
        }
    }
    public static void sortInsertion(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            int key = (int) students.get(i).getScore();
            int j = i - 1;

            while (j >= 0 && students.get(j).getScore() > key) {
                students.get(j+1).setScore(students.get(j).getScore());
                j--;
            }
            students.get(j+1).setScore(key);
        }

    }
    public static void sortBubble(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size()-i-1; j++) {
                if (students.get(j).getScore() > students.get(j+1).getScore()) {
                    int temp = (int) students.get(j).getScore();
                    students.get(j).setScore( students.get(j+1).getScore());
                    students.get(j+1).setScore(temp);
                }
            }
        }

    }
    public static void sortSelection(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getScore() > students.get(j + 1).getScore()) {
                    int temp = (int) students.get(j).getScore();
                    students.get(j).setScore(students.get(j + 1).getScore());
                    students.get(j + 1).setScore(temp);
                }
            }
        }
    }
}
