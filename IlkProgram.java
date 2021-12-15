import java.lang.*;
import java.util.Properties;
public class IlkProgram
{
    public static void main(String[] args)
    {
        System.out.println("KULLANICI DİZİN: "+System.getProperty("user.dir"));
 
        System.out.println("EV :  "+System.getProperty("home"));
 
        System.out.println("İŞLETİM SİSTEMİ : "+System.getProperty("os.name"));
 
        System.out.println("JAVA RUNTİME VERSİYONU : "+System.getProperty("java.runtime.version" ));
 
        System.out.println("AD : "+System.getProperty("name" ));
    }
}
