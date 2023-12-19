package Classes;

public class PasswordException extends Exception
{
    public String getMessage()
    {
        return "Password can't be less than 8 charecters:(";
    }
}