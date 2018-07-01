package marsRover.components.directionHandlers;

import marsRover.components.Coordinates;

public class EastDirectionHandler implements DirectionHandler {
    private Coordinates currentHandlersCoordinates;
    private static DirectionHandler instance;

    public static DirectionHandler getInstance() {
        if(instance == null){
            instance = new EastDirectionHandler();
        }
        return instance;
    }

    private EastDirectionHandler(){
    }

    @Override
    public void moveForward() {
        currentHandlersCoordinates.setX(currentHandlersCoordinates.getX() + 1);
    }

    @Override
    public void moveBackwards() {
        currentHandlersCoordinates.setX(currentHandlersCoordinates.getX() - 1);
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
