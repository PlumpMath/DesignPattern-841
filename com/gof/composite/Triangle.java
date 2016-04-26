package com.gof.composite;

public class Triangle implements Graphic{
	private int x, y, width, height;

	public void draw(){
		System.out.println("this is Triangle.(" + x + ", " + y + ") width: " + width + ", height: " + height);
	}

	public void set(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	};
}

