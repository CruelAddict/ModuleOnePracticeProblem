package exceptions;

public class ShowingFullException extends Exception {
    public ShowingFullException(){
        super("The showing is full!\n");
    }
}
