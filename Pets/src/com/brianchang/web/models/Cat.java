package com.brianchang.web.models;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	@Override
	public String showAffection() {
		String catphrase = "Your " + this.breed + " cat, " + this.name + ", looked at you with some affection. You think.";
		return catphrase;
	}
	
}
