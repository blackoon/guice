package com.blackoon.lr.guice.guicedi;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

public class MyModule implements Module{

	@Override
	public void configure(Binder binder) {
		binder.bind(IService.class).to(ServiceImpl.class).in(Scopes.SINGLETON);
		
//		binder.bind(IService.class).annotatedWith(MyInterface.class).to(
//			    ServiceImpl.class).in(Scopes.SINGLETON);
	}
	
}
