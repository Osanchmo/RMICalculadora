import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Dionis on 22/02/2016.
 */
public interface RMIServerInterficie extends Remote{

    public String calcularString(String string) throws  RemoteException;

}
