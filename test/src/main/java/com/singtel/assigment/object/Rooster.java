package com.singtel.assigment.object;

import java.util.ResourceBundle;

import com.singtel.assigment.interfaces.SayAble;

public class Rooster extends Animal implements SayAble {

//	To avoid using inheritance so i use has a relationship
	Chicken chicken = new Chicken();

	public void say() {
		ResourceBundle mybundle = ResourceBundle.getBundle("i18n");
		System.out.println(mybundle.getString("Rooster_Sound"));
	}
}
