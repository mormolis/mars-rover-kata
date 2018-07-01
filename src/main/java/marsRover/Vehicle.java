package marsRover;

import marsRover.components.Coordinates;
import marsRover.exceptions.ObstacleException;

public class Vehicle {

    private VehicleControlPanel vehicleControlPanel;
    private char[] journey;

    public Vehicle(VehicleControlPanel vehicleControlPanel, char[] journey) {
        this.vehicleControlPanel = vehicleControlPanel;
        this.journey = journey;
    }

    public Coordinates startJourney(){
        for (char direction : journey){
            try {
                vehicleControlPanel.move(direction);
            } catch( ObstacleException e){
                System.out.println("Obstacle hit");
                break;
            }
        }
        return vehicleControlPanel.getCurrentCoordinates();
    }

    public void scheduleAnotherJourney(char [] journey, VehicleControlPanel vehicleControlPanel){
        this.journey = journey;
        this.vehicleControlPanel = vehicleControlPanel;
    }


}
