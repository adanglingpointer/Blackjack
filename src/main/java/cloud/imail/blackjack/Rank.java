package cloud.imail.blackjack;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public int getValue() {
        return switch (this.rank) {
            case JACK, QUEEN, KING -> 10;
            default -> this.rank.ordinal() + 1;
        };
    }

}
