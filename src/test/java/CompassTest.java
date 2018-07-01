import marsRover.Compass;
import marsRover.HorizonPoint;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CompassTest {

    private Compass compass;
    @Before
    public void setup(){
        compass = new Compass(HorizonPoint.NORTH);
    }

    @Test
    public void compassShowsEastWhenTurnsLeftFromNorth(){
        compass.setCurrentDirection(HorizonPoint.NORTH);
        compass.turnLeft();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.EAST));
    }

    @Test
    public void compassShowsSouthWhenTurnsLeftFromEast(){
        compass.setCurrentDirection(HorizonPoint.EAST);
        compass.turnLeft();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.SOUTH));
    }

    @Test
    public void compassShowsWestWhenTurnsLeftFromSouth(){
        compass.setCurrentDirection(HorizonPoint.SOUTH);
        compass.turnLeft();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.WEST));
    }

    @Test
    public void setCompassShowsNorthWhenTurnsLeftFromWest(){
        compass.setCurrentDirection(HorizonPoint.WEST);
        compass.turnLeft();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.NORTH));
    }

    @Test
    public void compassShowsWestWhenTurnsRightFromNorth(){
        compass.setCurrentDirection(HorizonPoint.NORTH);
        compass.turnRight();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.WEST));
    }

    @Test
    public void compassShowsSouthWhenTurnsRightFromWest(){
        compass.setCurrentDirection(HorizonPoint.WEST);
        compass.turnRight();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.SOUTH));
    }

    @Test
    public void compassShowsEastWhenTurnsRightFromSouth(){
        compass.setCurrentDirection(HorizonPoint.SOUTH);
        compass.turnRight();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.EAST));
    }

    @Test
    public void compassShowsNorthWhenTurnsRightFromEast(){
        compass.setCurrentDirection(HorizonPoint.SOUTH);
        compass.turnRight();
        assertThat(compass.getCurrentDirection(), equalTo(HorizonPoint.EAST));
    }
}

//marsRover.Compass compass = new Commpass (NORTH)
//marsRover.HorizonPoint facing = compass.turnLeft()
