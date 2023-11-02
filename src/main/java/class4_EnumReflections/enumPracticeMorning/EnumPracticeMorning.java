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

        //Exc 4
        int currentX = 0;
        int currentY = 0;

        for (Direction direction: Direction.values()) {
            switch (direction) {
                case NORTH -> currentY += direction.getDeltaY();
                case SOUTH -> currentY -= direction.getDeltaY();
                case EAST -> currentX += direction.getDeltaX();
                case WEST -> currentX -= direction.getDeltaX();
            }
        }
        System.out.println("Current position: x = " + currentX + "; y = " + currentY);

        //Exc 5
        TrafficLight trafficLight = TrafficLight.GREEN;
        for (int i = 0; i < 10; i++) {
            System.out.println(trafficLight);
            trafficLight = trafficLight.getNext();
        }


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
}
