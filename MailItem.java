
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;
    private String to;
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String newFrom, String newTo,String newMessage)
    {
        // initialise instance variables
        from = newFrom ;
        to = newTo;
        message = newMessage;
    }

    /**
     * Devuelve el nombre del remitente del mail
     */
    public String getFrom()
    {
        return from;
    }
    /**
     * Devuelve el nombre de a quien se envia el mail
     */
    public String getTo()
    {
        return to;
    }
    /**
     * Devuelve el mensaje escrito
     */
    public String getMessage()
    {
        return message;
    }
    /**
     * Muestra los atributos
     */
    public void print()
    {
        System.out.println("from: " + from);
        System.out.println("to: " + to);
        System.out.println("message: " + message);
        
    }
    
}
