
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // Servidor asociado con el cliente
    private MailServer server;
    //Direccion de correo del usuario
    private String user;
    
    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer newServer, String newUser)
    {
        // initialise instance variables
        server = newServer ;
        user = newUser;
    }

    /**
     *Devuelve el mail que está guardado en el servidor
     */
    public MailItem getNextMailItem()
    {
        
        return server.getNextMailItem (user);
        
    }
    /**
     * 
     */
   public void printNextMailItem()
   {
       MailItem item = server.getNextMailItem(user);
       if (item == null)
       {
           System.out.println("no hay ningun mensaje");
       }
       
       else
       {
           item.print();
       }
       
   }
   
   public void sendMailItem(String to, String message)
   {
       MailItem item = new MailItem(user, to, message);
       server.post(item);
   }
   
   
}

