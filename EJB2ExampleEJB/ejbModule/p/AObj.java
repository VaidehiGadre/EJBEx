package p;

import java.rmi.RemoteException;

import javax.ejb.*;

public interface AObj extends EJBObject{

	public String hello() throws RemoteException;
	
}
