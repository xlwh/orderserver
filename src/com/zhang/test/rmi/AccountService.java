package com.zhang.test.rmi;

public class AccountService implements Account{
	
	@Override
	public void get() {
		System.out.println("取款成功");
	}

}
