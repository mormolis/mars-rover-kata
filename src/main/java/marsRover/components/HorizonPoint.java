package marsRover.components;

import marsRover.components.directionHandlers.*;

public enum HorizonPoint {
    NORTH('N', 0, NorthDirectionHandler.getInstance()),
    EAST('E', 1, EastDirectionHandler.getInstance()),
    SOUTH('S', 2, SouthDirectionHandler.getInstance()),
    WEST('W', 3, WestDirectionHandler.getInstance());

    private char abrv;
    private int mechanismIndex;
    private DirectionHandler directionHandler;

    HorizonPoint(char abrv, int mechanismIndex, DirectionHandler directionHandler){
        this.abrv = abrv;
        this.mechanismIndex = mechanismIndex;
        this.directionHandler = directionHandler;
    }

    public char getAbrv() {
        return abrv;
    }

    public int getMechanismIndex() {
        return mechanismIndex;
    }

    public DirectionHandler getDirectionHandler() {
        return directionHandler;
    }
}
