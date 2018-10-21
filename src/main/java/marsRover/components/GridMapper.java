package marsRover.components;

import marsRover.Terrain;

public class GridMapper {
    private final int COLUMN_INDEX = 0;
    private final int ROW_INDEX = 1;
    private Terrain[][] grid;
    private int maxCol;
    private int maxRow;
    private int x0;
    private int y0;

    public GridMapper( Terrain[][] grid) {
        this.maxCol = grid[0].length;
        this.maxRow = grid.length;
        this.grid = grid;
        this.x0 = this.maxRow / 2;
        this.y0 = this.maxCol / 2;
    }

    public int[] mapCoordinates(Coordinates coordinates){

        int x = coordinates.getX();
        int y = coordinates.getY();

        int [] gridIndexes = {x0, y0};

        if (y!=0) gridIndexes[COLUMN_INDEX] = gridIndexes[COLUMN_INDEX] - y;
        if (x!=0) gridIndexes[ROW_INDEX] = gridIndexes[ROW_INDEX] + x;

        if (Math.abs(x)>y0) gridIndexes[ROW_INDEX] = (maxCol + gridIndexes[ROW_INDEX]) % maxCol;
        if (Math.abs(y)>x0) gridIndexes[COLUMN_INDEX] = (maxRow + gridIndexes[COLUMN_INDEX]) % maxRow;

        return gridIndexes;
    }

    public boolean isObstacle(Coordinates coordinates){
        int[] gridIndexes = mapCoordinates(coordinates);
        System.out.println("grid indexes = " + gridIndexes[COLUMN_INDEX] +", " + gridIndexes[ROW_INDEX]);
        return grid[gridIndexes[COLUMN_INDEX]][gridIndexes[1]].equals(Terrain.OBSTACLE);
    }


}
