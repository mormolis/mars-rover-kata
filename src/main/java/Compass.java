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

    public HorizonPoint turnLeft(){
        pointerToCurrentDirection =  Math.abs(Math.abs(pointerToCurrentDirection - 1) % COMPASS_MECHANISM.length - COMPASS_MECHANISM.length);
        return COMPASS_MECHANISM[pointerToCurrentDirection];

    }

    private void setIndexOfCurrentDirection(){
        pointerToCurrentDirection = currentDirection.getMechanismIndex();
    }


}
