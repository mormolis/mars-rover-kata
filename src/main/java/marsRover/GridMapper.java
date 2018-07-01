package marsRover;

public class GridMapper {
    private final int COLUMN_INDEX = 0;
    private final int ROW_INDEX = 1;
    private int[][] grid;
    private int maxCol;
    private int maxRow;
    private int x0;
    private int y0;

    public GridMapper( int maxRow, int maxCol) {
        this.maxCol = maxCol;
        this.maxRow = maxRow;
        this.grid = new int [this.maxRow][this.maxCol];
        this.x0 = this.maxRow / 2;
        this.y0 = this.maxCol / 2;
    }

    public int[] mapCoordinates(Coordinates coordinates){

        int x = coordinates.getX();
        int y = coordinates.getY();

        int [] gridIndexes = {x0, y0};

        if (y!=0) gridIndexes[COLUMN_INDEX] = gridIndexes[COLUMN_INDEX] - y;
        if (x!=0) gridIndexes[1] = gridIndexes[ROW_INDEX] + x;

        if (Math.abs(x)>y0) gridIndexes[ROW_INDEX] = (maxCol + gridIndexes[ROW_INDEX]) % maxCol;
        if (Math.abs(y)>x0) gridIndexes[COLUMN_INDEX] = (maxRow + gridIndexes[COLUMN_INDEX]) % maxRow;

        return gridIndexes;
    }


}
