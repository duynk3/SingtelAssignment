package com.singtel.assigment.interfaces;

public interface SingAble {
	default void sing() {
		System.out.print("I am singing");
	}
}
