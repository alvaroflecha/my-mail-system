
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
    
    private MailItem lastEmail;
    
    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer server, String user)
    {
        // initialise instance variables
        this.server = server ;
        this.user =user;
        lastEmail = null;
        
      
    }

    /**
     *Devuelve el mail que está guardado en el servidor
     */
    public MailItem getNextMailItem()
    {
        //MailItem email = server.getNextMailItem(user); //se puede hacer con o sin variable local
        //return email;
        
        lastEmail= server.getNextMailItem (user); 
        return lastEmail;
        // sobre mi objeto server invoco el metodo que está en otra clase y que nos vale
        //entre parentesis ponemos donde tenemos almacenado el usuario del que quiero recuperar el email
        
    }
    /**
     * obtiene del servidor el siguiente correo del usuario y lo imprime por pantalla
     */
   public void printNextMailItem()
   {
       
       if (lastEmail == null)//si no hay mensajes en el servidor
       {
           System.out.println("no hay ningun mensaje");
       }
       
       else
       {
           lastEmail.print();
       }
       
   }
   /**
    * envia un correo a la direccion indicada con el contenido pasado por parametro
    */
   public void sendMailItem(String to, String message, String subject)
   {
       MailItem emailToSend = new MailItem(user, to,subject, message);
       server.post(emailToSend);
   }
   
   /**
    * Nos muestra por pantalla cuantos emails tiene el usuario
    */
   public void howManyMailItems()
   {   int numberOfMails = server.howManyMailItems(user);
       System.out.println("Numero de emails en el servidor: " + numberOfMails);
   }
   
   /**
    * Metodo que descarga email y responde automaticamente con un mensaje predefinido
    */
   public void getNextMailItemAndAutorespond()
   {
      MailItem correoOriginal = server.getNextMailItem(user);
        if(correoOriginal != null)
        {
           String to = correoOriginal.getFrom();
           String subject = "RE: "+ correoOriginal.getSubject();
           String message = correoOriginal.getMessage() + "\nEstamos de vacaciones, gracias por contactar";// \n para salto de linea
           MailItem correoNuevo = new MailItem (user,to, subject, message);
           server.post(correoNuevo);   
           //sendMailItem(to,subject, message);  --> alternativa a la ultima linea
        }
       
    
   }
   /**
    * Ver por pantalla cuantas veces queramos los datos del último mensaje recibido
    */
   public void lastEmail()
   {
       if (lastEmail == null)//si no hay mensajes en el servidor
       {
           System.out.println("no hay ningun mensaje");
       }
       
       else
       {
           lastEmail.print();
       }
   }
}

