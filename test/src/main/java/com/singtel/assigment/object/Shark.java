package com.singtel.assigment.object;

public class Shark extends Fish {

	public Shark() {
		this.color = "grey";
		this.size = "large";
	}

	private void eat(Fish fish) {
		System.out.println("eating fish" + fish);
	}

}
