
/**
 * Representa un mensaje de email
 * 
 */
public class MailItem
{
    //Almacena que direccion envia  el mensaje
    private String from;
    //almacena para que direccion es el mensaje
    private String to;
    //Almacena el contenido del mensaje
    private String message;
    
    private String subject;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String subject, String message)
    {
        // initialise instance variables
        this.from = from ;
        this.to = to;
        this.subject = subject;
        this.message = message;
        
        
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
     * Muestra por pantalla los datos de email
     */
    public void print()
    {
        System.out.println("from: " + from);
        System.out.println("to: " + to);
        System.out.println("subject: " + subject);
        System.out.println("message: " + message);
        
        
    }
    
}
