package Atm;

import Exceptions.BlockCard;
import Exceptions.NotEnoughMoney;
import Exceptions.PinNumberIsWrongException;

public class Multibanco {


    private int balance;



    public Multibanco(int balance) {
        this.balance=balance;

    }

    public int getBalance() {
        return balance;
    }


public void moneyAvailabe(int amount) throws NotEnoughMoneyOnMultibanco {
        if (balance - amount <0){
            throw new NotEnoughMoneyOnMultibanco();
        }
}

    public void  withdraw(Card card, int amount, int pinNumber) {
        try {
            card.checkPinNumber(pinNumber);
            moneyAvailabe(amount);
            card.withdraw(amount);
        } catch (PinNumberIsWrongException e) {
            System.out.println(e.getMessage());
        }catch (BlockCard e) {
            System.out.println(e.getMessage());
        } catch(NotEnoughMoney e) {
            System.out.println(e.getMessage());
        }
        catch(NotEnoughMoneyOnMultibanco e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
