package marsRover.navigators;

import marsRover.Coordinates;

public class WestHeading implements Navigatable{

    private Coordinates currentCoordinates;
    public WestHeading(Coordinates coordinates) {
        this.currentCoordinates = coordinates;
    }

    public WestHeading(){}

    @Override
    public void moveForward() {
        currentCoordinates.setX(currentCoordinates.getX() + 1);
    }

    @Override
    public void moveBackwards() {
        currentCoordinates.setX(currentCoordinates.getX() - 1);
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
