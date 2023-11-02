package class4_EnumReflections.enumPracticeMorning;

public enum Direction {
    NORTH(0, 5),
    SOUTH(0, 3),
    EAST(10, 0),
    WEST(5, 0);

    private int deltaX;
    private int deltaY;

    Direction(int x, int y){
        this.deltaX = x;
        this.deltaY = y;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }
}
