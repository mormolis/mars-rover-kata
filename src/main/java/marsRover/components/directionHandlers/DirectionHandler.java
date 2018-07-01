package marsRover.components.directionHandlers;

import marsRover.components.Coordinates;

public interface DirectionHandler {
    void moveForward();
    void moveBackwards();
    void updateCoordinates(Coordinates coordinates);
    Coordinates getCurrentHandlersCoordinates();


}
