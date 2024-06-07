package Exceptions;

public class PinNumberIsWrongException extends AtmExceptions {

    public PinNumberIsWrongException() {
        super("PinNumber is wrong");
    }

    public PinNumberIsWrongException(String message){
        super(message);
    }


}
