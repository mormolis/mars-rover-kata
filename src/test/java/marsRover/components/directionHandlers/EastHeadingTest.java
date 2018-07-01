package marsRover.components.directionHandlers;

import marsRover.components.Coordinates;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EastHeadingTest {

    private DirectionHandler eastHeading;
    private Coordinates coordinates;

    @Before
    public void setup(){
        eastHeading = EastDirectionHandler.getInstance();
        coordinates = new Coordinates();
    }

    @Test()
    public void eastHeadingmovingForwardChangesCoodinatesOnXNegadively(){
        coordinates.setX(0);
        coordinates.setY(0);
        Coordinates expectingCoordinates = new Coordinates(-1,0);
        eastHeading.updateCoordinates(coordinates);
        eastHeading.moveForward();
        assertThat(eastHeading.getCurrentHandlersCoordinates(), equalTo(expectingCoordinates));
    }

    @Test()
    public void eastHeadingmovingBackwardsChangesCoodinatesOnXPossitively(){
        coordinates.setX(0);
        coordinates.setY(0);
        Coordinates expectingCoordinates = new Coordinates(1,0);
        eastHeading.updateCoordinates(coordinates);
        eastHeading.moveBackwards();
        assertThat(eastHeading.getCurrentHandlersCoordinates(), equalTo(expectingCoordinates));
    }

}