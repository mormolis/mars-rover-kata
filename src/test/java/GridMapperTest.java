import marsRover.Coordinates;
import marsRover.GridMapper;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GridMapperTest {

    private GridMapper gridMapper;
    private Coordinates coordinates;

    @Before
    public void setup(){
        gridMapper = new GridMapper(7,9);
        coordinates = new Coordinates();
    }

    @Test
    public void mapCoordinatesreturnsThe0_0onTheGrid(){
        int [] expectedGridIndexes = {3,4};
        coordinates.setX(0);
        coordinates.setY(0);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesreturnsThe1_1onTheGrid(){
        int [] expectedGridIndexes = {2,5};
        coordinates.setX(1);
        coordinates.setY(1);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe2_1onTheGrid(){
        int [] expectedGridIndexes = {2,6};
        coordinates.setX(2);
        coordinates.setY(1);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe0_1onTheGrid(){
        int [] expectedGridIndexes = {2,4};
        coordinates.setX(0);
        coordinates.setY(1);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe1_0onTheGrid(){
        int [] expectedGridIndexes = {3,5};
        coordinates.setX(1);
        coordinates.setY(0);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));
    }

    @Test
    public void mapCoordinatesReturnsTheM2_0onTheGrid(){
        int [] expectedGridIndexes = {3,2};
        coordinates.setX(-2);
        coordinates.setY(0);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe0_M3onTheGrid(){
        int [] expectedGridIndexes = {6,4};
        coordinates.setX(0);
        coordinates.setY(-3);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe0_3onTheGrid(){
        int [] expectedGridIndexes = {0,4};
        coordinates.setX(0);
        coordinates.setY(3);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe5_3onTheGrid(){
        int [] expectedGridIndexes = {0,0};
        coordinates.setX(5);
        coordinates.setY(3);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe5_2onTheGrid(){
        int [] expectedGridIndexes = {1,0};
        coordinates.setX(5);
        coordinates.setY(2);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsThe5_4onTheGrid(){
        int [] expectedGridIndexes = {6,0};
        coordinates.setX(5);
        coordinates.setY(4);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }


    @Test
    public void mapCoordinatesReturnsThe10_10onTheGrid(){
        int [] expectedGridIndexes = {0,5};
        coordinates.setX(10);
        coordinates.setY(10);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));

    }

    @Test
    public void mapCoordinatesReturnsTheM5_M4onTheGrid(){
        int [] expectedGridIndexes = {0,8};
        coordinates.setX(-5);
        coordinates.setY(-4);
        int [] realCoordinates = gridMapper.mapCoordinates(coordinates);
        assertThat(realCoordinates, equalTo(expectedGridIndexes));
    }




}

