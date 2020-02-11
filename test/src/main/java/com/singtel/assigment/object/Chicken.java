package com.singtel.assigment.object;

import com.singtel.assigment.interfaces.FlyAble;
import com.singtel.assigment.interfaces.SayAble;

public class Chicken extends Bird implements SayAble {
	
	public void say() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public void fly() throws Exception {
		throw new Exception("I can't fly");
	}
	
}
