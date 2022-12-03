public class Player implements Fieldable{
    private int rowIndex;
    private int columnIndex;
    private int amountOfPlayerScores;
    private Field field;
    @Override
    public String getSymbol() {
        return " x ";
    }

    public Player(int rowIndex, int columnIndex, Field field) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.field = field;
    }

    public int getRowIndex() { return rowIndex; }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public Boolean makeMove(int deltaRowIndex, int deltaColumnIndex) {

        Boolean isIncorrectMove = true;

        int newRowIndex = rowIndex + deltaRowIndex;
        int newColumnIndex = columnIndex + deltaColumnIndex;

        if ((newRowIndex > 0) && (newRowIndex < 8)
                && (newColumnIndex > 0) && (newColumnIndex < 8)
                && !((field.getFieldable(newColumnIndex, newRowIndex)) instanceof Computer)) {

        }
        return isIncorrectMove;
    }
}