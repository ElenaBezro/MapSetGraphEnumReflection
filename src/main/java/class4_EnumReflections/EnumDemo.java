//package class4_EnumReflections;
//
//import java.util.EnumMap;
//import java.util.EnumSet;
//import java.util.List;
//
//enum PizzaStatus {
//
//    ORDERED(5) {
//        @Override
//        boolean isDeliverable() {
//            return false;
//        }
//    },
//    READY(2) {
//        @Override
//        boolean isDeliverable() {
//            return false;
//        }
//    },
//    DELIVERED(0) {
//        @Override
//        boolean isDeliverable() {
//            return false;
//        }
//    };
//    private final int timeToDelivery;
//
//    abstract boolean isDeliverable() {
//
//    }
//
//    PizzaStatus(int timeToDelivery) {
//        this.timeToDelivery == timeToDelivery
//    }
//
//    public int getTimeToDelivery() {
//        return timeToDelivery;
//    }
//}
//
//public class EnumDemo {
//    public static void main(String[] args) {
//        Pizza pizza = new Pizza(PizzaStatus.ORDERED);
//        pizza.getPizzaStatus();
//
//    }
//
//}
//
//class Pizza {
//    public static final EnumSet<PizzaStatus> undeliveredStatuses = EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);
//    public static final EnumMap<PizzaStatus, List<Pizza>> pizzasByStatuses (List<Pizza> pizzas) {
//        EnumMap<PizzaStatus, List<Pizza>> pizzasByStatuses = new EnumMap<>(PizzaStatus.class);
//        for
//
//        return pizzasByStatuses;
//    }
//
//    PizzaStatus pizzaStatus;
//
//    public Pizza(PizzaStatus pizzaStatus) {
//        this.pizzaStatus = pizzaStatus;
//    }
//
////    public boolean isDelivereable() {
////        return pizzaStatus == PizzaStatus.READY;
//
//    //    }
//    PizzaStatus getPizzaStatus() {
//        return pizzaStatus;
//    }
//
//    public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> pizzas) {
//        return pizzas.stream().filter(pizza -> undeliveredStatuses.contains(pizza.getPizzaStatus())).toList();
//    }
//
//
//}
//
