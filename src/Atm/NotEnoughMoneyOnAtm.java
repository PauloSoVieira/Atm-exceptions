package Atm;

import Exceptions.AtmExceptions;

public class NotEnoughMoneyOnAtm extends AtmExceptions {
    public NotEnoughMoneyOnAtm() {
        super("ATM out of money");
    }

    public NotEnoughMoneyOnAtm(String message) {
        super(message);
    }
}
