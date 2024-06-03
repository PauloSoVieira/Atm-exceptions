package Exceptions;

public class BlockCard extends Exception{
    public BlockCard() {
        super("card is blocked");
    }

    public BlockCard(String message) {
        super(message);
    }
}
