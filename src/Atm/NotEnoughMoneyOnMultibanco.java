package Atm;

public class NotEnoughMoneyOnMultibanco extends Exception {
    public NotEnoughMoneyOnMultibanco() {
        super("ATM out of money");
    }

    public NotEnoughMoneyOnMultibanco(String message) {
        super(message);
    }
}
