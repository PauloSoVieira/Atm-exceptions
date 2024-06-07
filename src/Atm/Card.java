package Atm;

import Exceptions.AtmExceptions;
import Exceptions.BlockCard;
import Exceptions.NotEnoughMoney;
import Exceptions.PinNumberIsWrongException;

public class Card {
    private int pinNumber;
    protected int bankBalance;
    private int tryPinNumberCount;
    private int fee=-100;


    public Card(int pinNumber, int bankBalance) {
        this.pinNumber=pinNumber;
        this.bankBalance= bankBalance;
    }

    public boolean checkPinNumber(int pin) throws AtmExceptions {
        if (pin != pinNumber){
            tryPinNumberCount++;

            if (tryPinNumberCount>=2){
                throw new BlockCard();
            }
            throw new PinNumberIsWrongException();
        }
        tryPinNumberCount=0;
        return true;

    }

    public int getBankBalance() {
        System.out.println(bankBalance);
        return bankBalance;
    }



    public void withdraw(int amount) throws NotEnoughMoney {
        if (bankBalance -amount <=fee ){
            throw new NotEnoughMoney();
        }

        bankBalance=bankBalance-amount;
    }


}
