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
        assertThat(compass.turnLeft(), equalTo(HorizonPoint.EAST));
    }

    @Test
    public void compassShowsSouthWhenTurnsLeftFromEast(){
        compass.setCurrentDirection(HorizonPoint.EAST);
        assertThat(compass.turnLeft(), equalTo(HorizonPoint.SOUTH));
    }



    @Test
    public void compassShowsWestWhenTurnsRightFromNorth(){
    }


}

//Compass compass = new Commpass (NORTH)
//HorizonPoint facing = compass.turnLeft()
