package com.singtel.assigment.object;

import com.singtel.assigment.interfaces.SayAble;
import com.singtel.assigment.interfaces.SwimAble;

public class Duck extends Bird implements SayAble, SwimAble {
	public void say() {
		System.out.println("Quack, quack");
	}

}
