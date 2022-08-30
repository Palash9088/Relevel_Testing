package CustomExceptionAssignment;//import java.util.*;

public class AgeVerifyException extends ArithmeticException{
    public AgeVerifyException(String message)
    {
        super(message);
    }
}
