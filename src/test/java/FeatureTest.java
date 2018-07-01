import marsRover.Terrain;
import marsRover.Vehicle;
import marsRover.VehicleControlPanel;
import marsRover.components.Compass;
import marsRover.components.Coordinates;
import marsRover.components.GridMapper;
import marsRover.components.HorizonPoint;

public class FeatureTest {
    public static void main(String[] args) {
        //initialise grid
        Terrain [][] grid = new Terrain[5][5];
        for (int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                grid[i][j] = Terrain.NON_OBSTACLE;
            }
        }
        //setting 2 obstacles
        grid[1][3] = Terrain.OBSTACLE;
        grid[3][1] = Terrain.OBSTACLE;

        //heading north from 0,0
        char [] journey = {'f','l','f','r','f','f','r','f','f','l','f','f','f'};

        VehicleControlPanel vehicleControlPanel = new VehicleControlPanel(
                                                        new Compass(HorizonPoint.NORTH),
                                                        new GridMapper(grid),
                                                        null);
        vehicleControlPanel.setCurrentCoordinates(new Coordinates(0,0));
        Vehicle vehicle = new Vehicle(vehicleControlPanel, journey);
        Coordinates coordinates = vehicle.startJourney();
        System.out.println(coordinates);
    }
}
