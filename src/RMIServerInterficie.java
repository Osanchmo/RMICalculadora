import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Dionis on 22/02/2016.
 */
public interface RMIServerInterficie extends Remote{

    //Implementem els metodes de la calculadora

    /**
     * Realitza el cálcul a partir d'un string
     * @param string
     * @return
     * @throws RemoteException
     */
    String calcularString(String string) throws  RemoteException;

}
