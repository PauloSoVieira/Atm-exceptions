package Exceptions;

public class MyException extends Exception {
    public void withdraw() throws MyException{
        if(true) {
            throw new MyException();
        }
    }

}
