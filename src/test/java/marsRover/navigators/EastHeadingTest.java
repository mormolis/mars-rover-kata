package marsRover.navigators;

import marsRover.Coordinates;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EastHeadingTest {

    private Navigatable eastHeading;
    private Coordinates coordinates;

    @Before
    public void setup(){
        eastHeading = new EastHeading();
        coordinates = new Coordinates();
    }

    @Test()
    public void eastHeadingmovingForwardChangesCoodinatesOnXNegadively(){
        coordinates.setX(0);
        coordinates.setY(0);
        Coordinates expectingCoordinates = new Coordinates(-1,0);
        eastHeading.updateCoordinates(coordinates);
        eastHeading.moveForward();
        assertThat(eastHeading.getCurrentCoordinates(), equalTo(expectingCoordinates));
    }

    @Test()
    public void eastHeadingmovingBackwardsChangesCoodinatesOnXPossitively(){
        coordinates.setX(0);
        coordinates.setY(0);
        Coordinates expectingCoordinates = new Coordinates(1,0);
        eastHeading.updateCoordinates(coordinates);
        eastHeading.moveBackwards();
        assertThat(eastHeading.getCurrentCoordinates(), equalTo(expectingCoordinates));
    }

}