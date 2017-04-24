import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIHelloClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RMIServerInterficie interficie = null;

        try{
            System.out.println("Localitzant registre d'objectes remots ...");
            Registry registry = LocateRegistry.getRegistry("localhost",5555);
            System.out.println("Obtenint l'objecte remot...");
            interficie = (RMIServerInterficie) registry.lookup("dirHello");
        }catch (Exception e){
            e.printStackTrace();
        }



        if(interficie!= null){
            System.out.println("Calculadora remota");
            try{
                System.out.println("Escriu l'expressió: ");
                String question = scanner.nextLine();

                System.out.println("El resultat és:");
                System.out.println(interficie.calcularString(question));

            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FI");

    }

}
