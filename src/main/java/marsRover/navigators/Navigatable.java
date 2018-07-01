package marsRover.navigators;

import marsRover.Coordinates;

public interface Navigatable {
    void moveForward();
    void moveBackwards();
    void updateCoordinates(marsRover.Coordinates coordinates);
    Coordinates getCurrentCoordinates();


}
