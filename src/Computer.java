public class Computer implements Fieldable{

    private int rowIndex;
    private int columnIndex;
    @Override
    public String getSymbol() {
        return " o ";
    }

    public Computer(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }


}
