package com.basic.springfundamentals;

public class SingletonA {
	// Singleton -> Only 1 object will be created of this class in entire application
	
	private static SingletonA singltn;
	
	// 1. make constructor private	
	private SingletonA() {
		
	}
	
	// Without creating object of any class, how can i access method of that class?	
	public static SingletonA getSingletonA() {
		if (singltn == null ) {
			System.out.println("Creating object...");			
			singltn = new SingletonA();
		} else {
			System.out.println("Returning old object...");
		}
		
		return singltn;
	}
	
	
}
