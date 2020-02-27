package p;

import java.rmi.RemoteException;

import javax.ejb.*;

public interface AHome extends EJBHome{

	AObj create() throws CreateException,RemoteException;
}
