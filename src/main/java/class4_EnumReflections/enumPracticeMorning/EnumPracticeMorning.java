package class4_EnumReflections.enumPracticeMorning;

public class EnumPracticeMorning {

    public static void main(String[] args) {
        //Exc 1
        Day dayOfTheWeek = new Day(DaysOfTheWeek.TUESDAY);
        System.out.println(dayOfTheWeek.getNextDay());

        //Exc 2
        System.out.println(CardSuit.CLUBS.getRandomSuit());

        //Exc 3
        System.out.println(Month.JUNE.getDays());
    }

    static class Day {
        private DaysOfTheWeek dayOfTheWeek;

        public Day(DaysOfTheWeek dayOfTheWeek) {
            this.dayOfTheWeek = dayOfTheWeek;
        }

        public DaysOfTheWeek getNextDay() {
            switch (getCurrentDay()) {
                case MONDAY -> {
                    return DaysOfTheWeek.TUESDAY;
                }
                case TUESDAY -> {
                    return DaysOfTheWeek.WEDNESDAY;
                }
                case WEDNESDAY -> {
                    return DaysOfTheWeek.THURSDAY;
                }
                case THURSDAY -> {
                    return DaysOfTheWeek.FRIDAY;
                }
                case FRIDAY -> {
                    return DaysOfTheWeek.SATURDAY;
                }
                case SATURDAY -> {
                    return DaysOfTheWeek.SUNDAY;
                }
                case SUNDAY -> {
                    return DaysOfTheWeek.MONDAY;
                }
                default -> throw new IllegalStateException("Unexpected value: " + getCurrentDay());
            }
        }

        public DaysOfTheWeek getCurrentDay() {
            return dayOfTheWeek;
        }
    }




//TODO:

    //4.Directional Constants:
    //Create an enum named Direction to represent cardinal directions (NORTH, SOUTH, EAST, WEST).
    //Define constants for each direction within the enum.
    //Implement a constructor in the enum that takes two integers, deltaX and deltaY, representing changes in x and y coordinates when moving in that direction.
    //Implement methods in the enum to calculate new x and y coordinates based on the current position and direction.
    //Demonstrate the usage of the Direction enum by simulating movement in different directions from a given starting position.
    //
    //5.Traffic Lights:
    //Create an enum named TrafficLight to represent the three colors of a traffic light (RED, YELLOW, GREEN).
    //Define constants for each color within the enum.
    //Implement a method called getNextColor that calculates and returns the next color in the traffic light sequence.
    //Demonstrate the usage of the TrafficLight enum by simulating a traffic light sequence, starting from a given color, and printing the sequence.
}
