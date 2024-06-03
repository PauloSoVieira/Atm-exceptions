package Exceptions;

public class PinNumberIsWrongException extends Exception {

    public PinNumberIsWrongException() {
    }

    public PinNumberIsWrongException(String message){
        super(message);
    }


}
