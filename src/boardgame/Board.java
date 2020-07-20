package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Pierce[][] pierces;
	public Board(int rows, int columns) {
		
		this.rows = rows;
		this.columns = columns;
		pierces = new Pierce [rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Pierce pierce (int row, int column) {
		return pierces [row] [column];
	}
	public Pierce pierce (Position position) {
		return pierces [position.getRow()][position.getColumn()];
	}
	
}
