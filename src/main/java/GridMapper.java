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

    public int[] mapCoordinates(int x, int y){

        int [] coordinates = {x0, y0};

        if (y!=0) coordinates[COLUMN_INDEX] = coordinates[COLUMN_INDEX] - y;
        if (x!=0) coordinates[1] = coordinates[ROW_INDEX] + x;

        if (Math.abs(x)>y0) coordinates[ROW_INDEX] = (maxCol + coordinates[ROW_INDEX]) % maxCol;
        if (Math.abs(y)>x0) coordinates[COLUMN_INDEX] = (maxRow + coordinates[COLUMN_INDEX]) % maxRow;

        return coordinates;
    }


}
