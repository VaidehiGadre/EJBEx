package com.ejbexample;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/*	This is a remote interface.
	This interface provides remote client a view of the EJBObject.*/
public interface Hello extends EJBObject{

	//This interface defines business methods callable by remote client.
	public String getHelloWorld() throws RemoteException;
	
}
