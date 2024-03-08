package cloud.imail.blackjack;

public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    private char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }
}
