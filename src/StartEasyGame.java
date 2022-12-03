import java.util.ArrayList;
import java.util.Scanner;

public class StartEasyGame {
    private int rows;
    private int columns;
    private int amountOfPlayerScores;
    private int amountOfComputerScores;
    private Field field;
    private boolean isGameFinished = false;
    private boolean isIncorrectCommand = true;
    private Player player;
    private Scanner scanner = new Scanner(System.in);

    ArrayList<Player> playerMoves = new ArrayList<Player>();
    ArrayList<Computer> computerMoves = new ArrayList<Computer>( );

    public Field getField() {
        return this.field;
    }

    public StartEasyGame(ArrayList<Player> playerMoves, ArrayList<Computer> computerMoves) {
        this.playerMoves = playerMoves;
        this.computerMoves = computerMoves;
    }

    public StartEasyGame(int rows, int columns, int amountOfPlayerScores, int amountOfComputerScores) {
        this.rows = rows;
        this.columns = columns;
        this.amountOfPlayerScores = amountOfPlayerScores;
        this.amountOfComputerScores = amountOfComputerScores;
        field = new Field(rows, columns);
    }

    public void fillFieldNull () {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                field.setFieldable(i, j, new Empty());
            }
        }
    }

    public void StartGame() {

        possesPlayer();
        possesComputer();

        while (!isGameFinished) {
            showField();
            playerTurn();
            if (isIncorrectCommand) {
                incorrectCommand();
                continue;
            }
            computerTurn();
            checkIfGameNotFinished();
        }
    }

    private void incorrectCommand() {
        System.out.println("You can not move here, please try again");
    }
    private void possesComputer() {

    }

    private void possesPlayer() {

    }

    private void checkIfGameNotFinished() {
    }

    public void showField() {
        System.out.println("\nYour scores: " + amountOfPlayerScores
                + "\nComputer scores: " + amountOfComputerScores);
        field.showField();
    }

    private void playerTurn() {
        System.out.println("Enter row-move: ");
        int row = scanner.nextInt();
        System.out.println("Enter column-move: ");
        int column = scanner.nextInt();
        isIncorrectCommand = player.makeMove(row, column);
    }

    private void computerTurn() {
    }
}