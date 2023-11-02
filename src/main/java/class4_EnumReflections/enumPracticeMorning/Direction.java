package class4_EnumReflections.enumPracticeMorning;

public enum Direction {
    //

//TODO:

    //4.Directional Constants:
    //Create an enum named Direction to represent cardinal directions (NORTH, SOUTH, EAST, WEST).
    //Define constants for each direction within the enum.
    //Implement a constructor in the enum that takes two integers, deltaX and deltaY, representing changes in x and y coordinates when moving in that direction.
    //Implement methods in the enum to calculate new x and y coordinates based on the current position and direction.
    //Demonstrate the usage of the Direction enum by simulating movement in different directions from a given starting position.
    //
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
