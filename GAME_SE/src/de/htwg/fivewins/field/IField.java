package de.htwg.fivewins.field;

/*
 * @author Max,Manuel
 */
public interface IField {
	
	/*
	 * @param column
	 * @param row
	 * @return specific cell value
	 */
	String getCellValue(int column, int row);
	
	/*
	 * set value in cell [column] [row]
	 * @param column
	 * @param row
	 */
	void setValue(int column, int row, String value);
	
	/*
	 * @return the size of the gamefield
	 */
	int getSize();
	
	/*
	 * @return the gamefield(a 2 dimensional array).
	 */
	String[][] getGameField();
}
