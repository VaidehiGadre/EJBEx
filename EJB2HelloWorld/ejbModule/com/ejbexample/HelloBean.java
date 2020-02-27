package com.ejbexample;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloBean implements SessionBean {

	public String getHelloWorld() {
		return "EJB 2 Hello World!!!";
	}

	public void ejbCreate() {
		System.out.println("calling ejbcreate....");
	}

	public void ejbRemove() {
		System.out.println("calling ejbremove");
	}

	public void ejbActivate() throws EJBException, RemoteException {
		System.out.println("calling ejbactivate");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		System.out.println("calling ejbpassivate");
	}

	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		System.out.println("calling session context");
	}

}
