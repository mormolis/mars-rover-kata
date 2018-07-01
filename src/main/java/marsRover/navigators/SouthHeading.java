package marsRover.navigators;

import marsRover.Coordinates;

public class SouthHeading implements Navigatable{

    private Coordinates currentCoordinates;

    public SouthHeading(Coordinates coordinates) {
        this.currentCoordinates = coordinates;
    }

    public SouthHeading(){}

    @Override
    public void moveForward() {
        currentCoordinates.setY(currentCoordinates.getY() - 1);
    }

    @Override
    public void moveBackwards() {
        currentCoordinates.setY(currentCoordinates.getY() + 1);
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
