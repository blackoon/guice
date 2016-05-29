package com.blackoon.lr.guice.guicedi;

import com.google.inject.Inject;


public class Action {
	
	IService service;
	
	@Inject
	void setIService(IService service) {//method name any define
		this.service=service;
	}
	
	public void print(){
		service.doSomething();
	}
}
