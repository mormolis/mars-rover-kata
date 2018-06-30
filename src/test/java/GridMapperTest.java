import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GridMapperTest {

    private GridMapper gridMapper;

    @Before
    public void setup(){
        gridMapper = new GridMapper(7,9);
    }

    @Test
    public void mapCoordinatesreturnsThe0_0onTheGrid(){
        int [] expectedCoordinates = {3,4};
        int [] realCoordinates = gridMapper.mapCoordinates(0,0);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesreturnsThe1_1onTheGrid(){
        int [] expectedCoordinates = {2,5};
        int [] realCoordinates = gridMapper.mapCoordinates(1,1);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe2_1onTheGrid(){
        int [] expectedCoordinates = {2,6};
        int [] realCoordinates = gridMapper.mapCoordinates(2,1);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe0_1onTheGrid(){
        int [] expectedCoordinates = {2,4};
        int [] realCoordinates = gridMapper.mapCoordinates(0,1);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe1_0onTheGrid(){
        int [] expectedCoordinates = {3,5};
        int [] realCoordinates = gridMapper.mapCoordinates(1,0);
        assertThat(realCoordinates, equalTo(expectedCoordinates));
    }

    @Test
    public void mapCoordinatesReturnsTheM2_0onTheGrid(){
        int [] expectedCoordinates = {3,2};
        int [] realCoordinates = gridMapper.mapCoordinates(-2,0);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe0_M3onTheGrid(){
        int [] expectedCoordinates = {6,4};
        int [] realCoordinates = gridMapper.mapCoordinates(0,-3);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe0_3onTheGrid(){
        int [] expectedCoordinates = {0,4};
        int [] realCoordinates = gridMapper.mapCoordinates(0,3);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe5_3onTheGrid(){
        int [] expectedCoordinates = {0,0};
        int [] realCoordinates = gridMapper.mapCoordinates(5,3);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe5_2onTheGrid(){
        int [] expectedCoordinates = {1,0};
        int [] realCoordinates = gridMapper.mapCoordinates(5,2);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsThe5_4onTheGrid(){
        int [] expectedCoordinates = {6,0};
        int [] realCoordinates = gridMapper.mapCoordinates(5,4);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }


    @Test
    public void mapCoordinatesReturnsThe10_10onTheGrid(){
        int [] expectedCoordinates = {0,5};
        int [] realCoordinates = gridMapper.mapCoordinates(10,10);
        assertThat(realCoordinates, equalTo(expectedCoordinates));

    }

    @Test
    public void mapCoordinatesReturnsTheM5_M4onTheGrid(){
        int [] expectedCoordinates = {0,8};
        int [] realCoordinates = gridMapper.mapCoordinates(-5,-4);
        assertThat(realCoordinates, equalTo(expectedCoordinates));
    }




}

