package com.gof.composite;

public class Circle implements Graphic{
	private int x, y, r;
	
	public void draw(){
		System.out.println("this is Circle.("+ x + ", " + y + ") 半径:" + r );
	}
	
	public void set(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
