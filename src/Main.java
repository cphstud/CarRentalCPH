import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.runProgram();
    }

    public void runProgram() {
        int choice = 0;
        int exitvalue = 9;

        while (choice != exitvalue) {
            Car tmpCar = null;
            printMainMenu();
            System.out.println("Vælg menupunkt");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : tmpCar = findBil();
            }

        }


    }

    public Car findBil() {
        int choice=0;
        int exitvalue = 9;

        while (choice != exitvalue) {

        }
    }

    public void printMainMenu() {
        // print optionerne

    }

}
