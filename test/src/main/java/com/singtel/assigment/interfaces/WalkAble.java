package com.singtel.assigment.interfaces;

public interface WalkAble {
	default void walk(){
		System.out.print("I am walking");
	}
}
