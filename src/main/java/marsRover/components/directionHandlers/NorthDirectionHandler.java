package marsRover.components.directionHandlers;

import marsRover.components.Coordinates;

public class NorthDirectionHandler implements DirectionHandler {

    private Coordinates currentHandlersCoordinates;

    private static DirectionHandler instance;

    public static DirectionHandler getInstance() {
        if(instance == null){
            instance = new NorthDirectionHandler();
        }
        return instance;
    }
    private NorthDirectionHandler(){}

    @Override
    public void moveForward() {
        currentHandlersCoordinates.setY(currentHandlersCoordinates.getY() + 1);
    }

    @Override
    public void moveBackwards() {
        currentHandlersCoordinates.setY(currentHandlersCoordinates.getY() - 1);
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
