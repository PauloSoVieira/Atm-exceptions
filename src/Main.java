import Atm.Card;
import Atm.Multibanco;
import Exceptions.MyException;
import Exceptions.PinNumberIsWrongException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MyException, PinNumberIsWrongException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Multibanco multibanco = new Multibanco(100);
       Card card = new Card(1234,10000);


     /*   multibanco.withdraw(card,10,12);
        multibanco.withdraw(card,10,1234);
        card.getBankBalance(); */

        multibanco.withdraw(card,199,1234);
       // card.getBankBalance();

     //   multibanco.withdraw(card,10,12);

      // card.getBankBalance();
    }
}