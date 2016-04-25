package com.gof.composite;

public class Circle extends Graphic{

	public void draw(){
		System.out.println("this is Circle.("+ x + ", " + y + ") 半径:" + r );
	}
}
