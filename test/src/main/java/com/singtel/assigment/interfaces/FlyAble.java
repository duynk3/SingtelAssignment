package com.singtel.assigment.interfaces;

public interface FlyAble {
	default void fly() throws Exception {
		System.out.print("I am flying");
	}
}
