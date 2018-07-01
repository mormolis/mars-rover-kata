package marsRover;

import marsRover.components.Compass;
import marsRover.components.Coordinates;
import marsRover.components.GridMapper;
import marsRover.components.HorizonPoint;
import marsRover.components.directionHandlers.DirectionHandler;
import marsRover.exceptions.ObstacleException;

import java.util.Stack;

public class VehicleControlPanel {

    private Compass compass;
    private GridMapper gridMapper;
    private DirectionHandler directionHandler;
    private Coordinates currentCoordinates;
    private HorizonPoint currentFacing;

    private Stack<Coordinates> journeyTrack;

    public VehicleControlPanel(Compass compass, GridMapper gridMapper, DirectionHandler directionHandler) {
        this.compass = compass;
        this.currentFacing = compass.getCurrentDirection();
        this.currentCoordinates = new Coordinates(0,0);
        updateAllDirectionHandlers();
        this.gridMapper = gridMapper;
        this.directionHandler = compass.getCurrentDirection().getDirectionHandler();
        journeyTrack = new Stack<>();
    }

    public void setCurrentCoordinates(Coordinates currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    public void setCurrentFacing(HorizonPoint horizonPoint){
        this.currentFacing = horizonPoint;
        this.directionHandler = currentFacing.getDirectionHandler();
        this.directionHandler.updateCoordinates(currentCoordinates);
    }

    public Coordinates getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void setGridMapper(GridMapper gridMapper) {
        this.gridMapper = gridMapper;
    }

    public void move(char direction) throws ObstacleException{
        if(direction == 'f'){
            directionHandler.moveForward();
        } else if (direction == 'b'){
            directionHandler.moveBackwards();
        } else if( direction == 'l'){
            compass.turnLeft();
            setCurrentFacing(compass.getCurrentDirection());
        } else if (direction == 'r'){
            compass.turnRight();
            setCurrentFacing(compass.getCurrentDirection());
        }

        if (!isObstacleAhead()){
            currentCoordinates = directionHandler.getCurrentHandlersCoordinates();
            journeyTrack.push(new Coordinates(currentCoordinates.getX(), currentCoordinates.getY()));
            updateAllDirectionHandlers();
        } else {
            System.out.println(journeyTrack);
            currentCoordinates = journeyTrack.pop();
            throw new ObstacleException();
        }
    }


    private void updateAllDirectionHandlers(){
        HorizonPoint [] allHorizonPoints = HorizonPoint.values();
        for (HorizonPoint hp : allHorizonPoints){
            hp.getDirectionHandler().updateCoordinates(currentCoordinates);
        }
    }

    private boolean isObstacleAhead(){
         return gridMapper.isObstacle(directionHandler.getCurrentHandlersCoordinates());
    }
}
