
public class Location {
	public int row = 0;
	public int column = 0;
	public double maxValue = 0;
	
	public Location() {
		
	}
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public double getMaxValue() {
		return maxValue;
	}
	
	
}
