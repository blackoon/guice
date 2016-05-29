package com.blackoon.lr.guice.guicedi;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Client {

	public static void main(String[] args) {
		MyModule module = new MyModule();// defined inject regular
		Injector injector = Guice.createInjector(module);// injector
		Action action = new Action();
		injector.injectMembers(action);
		action.print();
	}
	
}
