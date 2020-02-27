package p;

import java.rmi.RemoteException;

import javax.ejb.*;

public class A  implements SessionBean{

	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	
	public void ejbCreate(){
		
	}
	
	public String hello() throws RemoteException{
		return "hello";
	}
}
