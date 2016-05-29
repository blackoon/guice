package com.blackoon.lr.guice.guicedi;

import com.google.inject.ImplementedBy;

@ImplementedBy(ServiceImpl.class)//用的话 就不需要绑定了
public interface IService {
	void doSomething();
}
