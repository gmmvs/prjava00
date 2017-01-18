package prjava00;
import java.net.*;
public class Prjava00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("hola mon");
        System.out.println("versio 0.1 del projecte prjava00");
    try{
        InetAddress addr = InetAddress.getLocalHost();
        String ipAddr = addr.getHostAddress();
        String hostname = addr.getHostName();
        System.out.println("hostname ="+hostname);
        System.out.println("Adreça IP: " +ipAddr);
        System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
        System.out.println("Carpeta personal: " + System.getProperty("user.home"));
        System.out.println("Sistema operatiu: "+ System.getProperty("os.name"));
        System.out.println("Versió OS: "+ System.getProperty("os.version"));
        
    }catch(UnknownHostException e){
        e.printStackTrace();
    }
    }
    
}
