package marsRover.components.directionHandlers;

import marsRover.components.Coordinates;

public class SouthDirectionHandler implements DirectionHandler {

    private Coordinates currentHandlersCoordinates;


    private static DirectionHandler instance;

    public static DirectionHandler getInstance() {
        if(instance == null){
            instance = new SouthDirectionHandler();
        }
        return instance;
    }

    private SouthDirectionHandler(){}

    @Override
    public void moveForward() {
        currentHandlersCoordinates.setY(currentHandlersCoordinates.getY() - 1);
    }

    @Override
    public void moveBackwards() {
        currentHandlersCoordinates.setY(currentHandlersCoordinates.getY() + 1);
    }


    @Override
    public void updateCoordinates(Coordinates coordinates) {
        this.currentHandlersCoordinates = coordinates;

    }

    @Override
    public Coordinates getCurrentHandlersCoordinates() {
        return this.currentHandlersCoordinates;
    }

}
