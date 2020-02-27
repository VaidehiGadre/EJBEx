package com.ejbexample;

import java.util.*;
import javax.naming.InitialContext;
import javax.naming.Context;

public class HelloWorldClient {

	public static void main(String args[]) {

		try {
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			p.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
			p.put(Context.PROVIDER_URL, "localhost");
			InitialContext ctx = new InitialContext(p);

			HelloHome home = (HelloHome) ctx.lookup("JNDIName_hello");

			Hello bean = home.create();
			System.out.println(bean.getHelloWorld());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
