package class4_EnumReflections.enumPracticeMorning;
 public enum TrafficLight {
     GREEN,
     YELLOW,
     RED;

     public TrafficLight getNext() {
         return switch (this) {
             case GREEN -> YELLOW;
             case YELLOW -> RED;
             case RED -> GREEN;
         };
     }
 }
