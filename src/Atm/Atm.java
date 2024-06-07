package Atm;

import Exceptions.AtmExceptions;
import Exceptions.BlockCard;
import Exceptions.NotEnoughMoney;
import Exceptions.PinNumberIsWrongException;

public class Atm {


    private int balance;



    public Atm(int balance) {
        this.balance=balance;

    }

    public int getBalance() {
        return balance;
    }


public void moneyAvailabe(int amount) throws NotEnoughMoneyOnAtm {
        if (balance - amount <0){
            throw new NotEnoughMoneyOnAtm();
        }
}

    public void  withdraw(Card card, int amount, int pinNumber) {
        try {
            card.checkPinNumber(pinNumber);
            moneyAvailabe(amount);
            card.withdraw(amount);
        } catch (AtmExceptions e) {
            System.out.println(e.getMessage());
      /*  }catch (BlockCard e) {
            System.out.println(e.getMessage());
        } catch(NotEnoughMoney e) {
            System.out.println(e.getMessage());
        }
        catch(NotEnoughMoneyOnAtm e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        }

    }}
