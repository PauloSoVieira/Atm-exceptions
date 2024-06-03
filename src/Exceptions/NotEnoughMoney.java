package Exceptions;

public class NotEnoughMoney extends Exception{
    public NotEnoughMoney() {
        super("You dont have enough money");
    }

    public NotEnoughMoney(String message) {
        super(message);
    }
}
