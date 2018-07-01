package marsRover;

public class Compass {

    private HorizonPoint currentDirection;
    private int pointerToCurrentDirection;
    private final HorizonPoint [] COMPASS_MECHANISM = {HorizonPoint.NORTH, HorizonPoint.WEST, HorizonPoint.SOUTH, HorizonPoint.EAST};

    public Compass(HorizonPoint initialDirection){
        this.currentDirection = initialDirection;
        setIndexOfCurrentDirection();
    }

    public void setCurrentDirection(HorizonPoint horizonPoint){
        this.currentDirection = horizonPoint;
        setIndexOfCurrentDirection();
    }

    public void turnLeft(){
        pointerToCurrentDirection--;
        if (pointerToCurrentDirection < 0) pointerToCurrentDirection = 3;
        currentDirection = COMPASS_MECHANISM[pointerToCurrentDirection];
    }

    public void turnRight(){
        pointerToCurrentDirection++;
        if (pointerToCurrentDirection > 3) pointerToCurrentDirection = 0;
        currentDirection = COMPASS_MECHANISM[pointerToCurrentDirection];
    }

    public HorizonPoint getCurrentDirection() {
        return currentDirection;
    }

    private void setIndexOfCurrentDirection(){
        pointerToCurrentDirection = currentDirection.getMechanismIndex();
    }


}
