import java.rmi.Naming;
import java.lang.Exception;

public class ServidorRMI{
    public static void main(String[] args) throws Exception{
        String url = "rmi://localhost/multiplicacion";
        url = "rmi://" + args[0] + "/multiplicacion";
        ClaseRMI obj = new ClaseRMI();
        Naming.bind(url,obj);
        System.out.println("Servidor "+ args[0]);
    }
}
