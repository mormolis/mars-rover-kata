package marsRover.navigators;

import marsRover.Coordinates;
import marsRover.navigators.*;

public class EastHeading implements Navigatable {
    private Coordinates currentCoordinates;
    public EastHeading(Coordinates coordinates) {
        this.currentCoordinates = coordinates;
    }

    public EastHeading(){}

    @Override
    public void moveForward() {
        currentCoordinates.setX(currentCoordinates.getX() - 1);
    }

    @Override
    public void moveBackwards() {
        currentCoordinates.setX(currentCoordinates.getX() + 1);
    }


    @Override
    public void updateCoordinates(Coordinates coordinates) {
        this.currentCoordinates = coordinates;

    }

    @Override
    public Coordinates getCurrentCoordinates() {
        return this.currentCoordinates;
    }
}
