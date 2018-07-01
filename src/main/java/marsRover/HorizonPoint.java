package marsRover;

public enum HorizonPoint {
    NORTH('N', 0), EAST('E', 3), SOUTH('S', 2), WEST('W', 1);

    private char abrv;
    private int mechanismIndex;

    HorizonPoint(char abrv, int mechanismIndex){
        this.abrv = abrv;
        this.mechanismIndex = mechanismIndex;
    }

    public char getAbrv() {
        return abrv;
    }

    public int getMechanismIndex() {
        return mechanismIndex;
    }
}
