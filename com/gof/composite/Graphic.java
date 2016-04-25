package com.gof.composite;

public abstract class Graphic{
	protected int x, y, r;

	abstract public void draw();
	
	public void set(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	};
}
