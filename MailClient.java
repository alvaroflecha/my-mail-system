
/**
 * Representa el cliente de correo electronico
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
    public MailClient(MailServer server, String user)
    {
        // initialise instance variables
        this.server = server ;
        this.user =user;
    }

    /**
     *Devuelve el mail que está guardado en el servidor
     */
    public MailItem getNextMailItem()
    {
        //MailItem email = server.getNextMailItem(user); //se puede hacer con o sin variable local
        //return email;
        
        return server.getNextMailItem (user); // sobre mi objeto server invoco el metodo que está en otra clase y que nos vale
        //entre parentesis ponemos donde tenemos almacenado el usuario del que quiero recuperar el email
        
    }
    /**
     * obtiene del servidor el siguiente correo del usuario y lo imprime por pantalla
     */
   public void printNextMailItem()
   {
       MailItem email = server.getNextMailItem(user);
       if (email == null)//si no hay mensajes en el servidor
       {
           System.out.println("no hay ningun mensaje");
       }
       
       else
       {
           email.print();
       }
       
   }
   /**
    * envia un correo a la direccion indicada con el contenido pasado por parametro
    */
   public void sendMailItem(String to, String message)
   {
       MailItem emailToSend = new MailItem(user, to, message);
       server.post(emailToSend);
   }
   
   
}

