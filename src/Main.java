import java.util.Scanner;

public class Main {

    public static int rows = 8;
    public static int columns = 8;
    public static int amountOfPlayerScores = 0;
    public static int amountOfComputerScores = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Welcome to Reversi Game!\nPlease make your choice and press Enter:");
            System.out.println("1. Easy (comp vs you)");
            System.out.println("2. Medium (comp vs you)");
            System.out.println("3. Player1 vs Player2");
            System.out.println("4. Exit");

            command = scanner.nextLine();

            switch (command) {

                case "1":
                    startEasyGame();
                    break;

                case "2":
                    startMediumGame();
                    break;

                case "3":
                    startPlayersGame();
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Command not recognized! Please try again");
            }
        }
        while(!command.equals("4"));


       /*
        System.out.println("8 |   |   |   |   |   |   |   |   |");
        System.out.println("7 |   |   |   |   |   |   |   |   |");
        System.out.println("6 |   |   |   |   |   |   |   |   |");
        System.out.println("5 |   |   |   | o | x |   |   |   |");
        System.out.println("4 |   |   |   | x | o |   |   |   |");
        System.out.println("3 |   |   |   |   |   |   |   |   |");
        System.out.println("2 |   |   |   |   |   |   |   |   |");
        System.out.println("1 |   |   |   |   |   |   |   |   |");
        System.out.println("  | a | b | c | d | e | f | g | h |");*/
    }

    private static void startPlayersGame() {
    }

    private static void startMediumGame() {

    }

    private static void startEasyGame() {
        StartEasyGame game = new StartEasyGame(rows, columns, amountOfPlayerScores, amountOfComputerScores);

        game.fillFieldNull();
        game.showField();

        game.StartGame();
    }
}