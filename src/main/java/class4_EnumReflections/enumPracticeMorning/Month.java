package class4_EnumReflections.enumPracticeMorning;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int daysInTheMonth;
    Month(int daysInTheMonth) {
        this.daysInTheMonth = daysInTheMonth;
    }

    public int getDaysInTheMonth() {
        return daysInTheMonth;
    }

    public int getDays() {
        return getDaysInTheMonth();
    }
}

//or use abstract method and override it for each enum constant
//public enum Month {
//    JANUARY(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    FEBRUARY(28) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    MARCH(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    APRIL(30) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    MAY(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    JUNE(30) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    JULY(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    AUGUST(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    SEPTEMBER(30) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    OCTOBER(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    NOVEMBER(30) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    },
//    DECEMBER(31) {
//        @Override
//        int getDays() {
//            return this.getDaysInTheMonth();
//        }
//    };
//
//    private int daysInTheMonth;
//    Month(int daysInTheMonth) {
//        this.daysInTheMonth = daysInTheMonth;
//    }
//
//    public int getDaysInTheMonth() {
//        return daysInTheMonth;
//    }
//
//    abstract int getDays();
//}

