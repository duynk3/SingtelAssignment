package com.singtel.assigment.interfaces;

public interface SayAble {
	default void say() {
		System.out.print("I am saying");
	}
}
