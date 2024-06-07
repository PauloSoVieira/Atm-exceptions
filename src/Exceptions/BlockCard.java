package Exceptions;

public class BlockCard extends AtmExceptions{
    public BlockCard() {
        super("card is blocked");
    }

    public BlockCard(String message) {
        super(message);
    }
}
