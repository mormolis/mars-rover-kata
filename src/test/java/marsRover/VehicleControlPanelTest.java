package marsRover;

import marsRover.components.Compass;
import marsRover.components.Coordinates;
import marsRover.components.GridMapper;
import marsRover.components.HorizonPoint;
import marsRover.exceptions.ObstacleException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;



public class VehicleControlPanelTest {
    private VehicleControlPanel vehicleControlPanel;

    private Terrain[][] gridTerrain = new Terrain[9][9];

    @Before
    public void setup(){
        populateGrid();
        vehicleControlPanel = new VehicleControlPanel(new Compass(HorizonPoint.NORTH), new GridMapper(gridTerrain), null);
    }

    @Test
    public void whenCurrentCoordinates1_1HeadingNorthAndNoObstacle_CoordinatesShouldChange() throws ObstacleException{
        vehicleControlPanel.setCurrentCoordinates(new Coordinates(1,1));
        vehicleControlPanel.setCurrentFacing(HorizonPoint.NORTH);
        vehicleControlPanel.move('f');
        assertThat(vehicleControlPanel.getCurrentCoordinates(), equalTo(new Coordinates(1,2)));
    }

    @Test(expected = ObstacleException.class)
    public void whenCurrentCoordinates0_0HeadingNorthAndObstacle_ShouldThrowException() throws ObstacleException{
        gridTerrain[3][4] = Terrain.OBSTACLE;
        vehicleControlPanel.setCurrentCoordinates(new Coordinates(0,0));
        vehicleControlPanel.setCurrentFacing(HorizonPoint.NORTH);
        vehicleControlPanel.move('f');
        assertThat(vehicleControlPanel.getCurrentCoordinates(), equalTo(new Coordinates(0,1)));
    }

    @Test
    public void whenCurrentCoordinates0_0HeadingNorthAndObstacle_CoordinatesShouldChange() throws ObstacleException{
        gridTerrain[3][4] = Terrain.NON_OBSTACLE;
        vehicleControlPanel.setCurrentCoordinates(new Coordinates(0,0));
        vehicleControlPanel.setCurrentFacing(HorizonPoint.NORTH);
        vehicleControlPanel.move('f');
        assertThat(vehicleControlPanel.getCurrentCoordinates(), equalTo(new Coordinates(0,1)));
    }

    @Test
    public void whenCurrentCoordinates0_0HeadingEastAndObstacle_CoordinatesShouldChange() throws ObstacleException{
        gridTerrain[3][4] = Terrain.NON_OBSTACLE;
        vehicleControlPanel.setCurrentCoordinates(new Coordinates(0,0));
        vehicleControlPanel.setCurrentFacing(HorizonPoint.EAST);
        vehicleControlPanel.move('f');
        assertThat(vehicleControlPanel.getCurrentCoordinates(), equalTo(new Coordinates(1,0)));
    }

    private void populateGrid(){
        for (int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                gridTerrain[i][j] = Terrain.NON_OBSTACLE;
            }
        }
    }








}