package com.gof.composite;

public class Rectangle extends Graphic{
	//private int x, y, r;

	public void draw(){
		System.out.println("this is Rectangle.(" + x + ", " + y + ") 半径:" + r);
	}
/*
	@Override
	public void set(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	*/
}
