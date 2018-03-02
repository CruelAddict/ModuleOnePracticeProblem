package exceptions;

public class UnderAgeException extends Exception {
    public UnderAgeException(int age){
        super("You're only "+age+"! Come back later!\n");
    }
}
