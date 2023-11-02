package class4_EnumReflections.enumPracticeMorning;

public enum CardSuit {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES;

    public CardSuit getRandomSuit() {
        int random = (int) (Math.random() * values().length);

        return switch (random) {
            case 0 -> HEARTS;
            case 1 -> DIAMONDS;
            case 2 -> CLUBS;
            case 3 -> SPADES;
            default -> throw new IllegalStateException("Unexpected value: " + random);
        };
    }
}
