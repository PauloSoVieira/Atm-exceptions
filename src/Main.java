import Atm.Card;
import Atm.Atm;
import Exceptions.PinNumberIsWrongException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MyException, PinNumberIsWrongException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Atm atm = new Atm(10000);
       Card card = new Card(1234,100000);


     /*   atm.withdraw(card,10,12);
        atm.withdraw(card,10,1234);
        card.getBankBalance(); */

        atm.withdraw(card,1118,12374);
       // card.getBankBalance();

     //   atm.withdraw(card,10,12);

      // card.getBankBalance();
    }
}