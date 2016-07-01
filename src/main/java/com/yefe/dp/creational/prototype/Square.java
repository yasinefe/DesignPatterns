package com.yefe.dp.creational.prototype;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
