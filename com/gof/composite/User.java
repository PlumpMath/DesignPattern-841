package com.gof.composite;

public class User{
	public static void main(String[] args){
		Rectangle rectangle1  = new Rectangle();
		Triangle triangle1 = new Triangle();
		Rectangle rectangle2 = new Rectangle();
		CompositeGraphics g1 = new CompositeGraphics();
		rectangle1.set(1,1,10);
		g1.add(rectangle1);
		g1.set("g1");
		CompositeGraphics g2 = new CompositeGraphics();
		triangle1.set(2,2,2);
		rectangle2.set(3,3,3);
		g2.add(triangle1);
		g2.add(rectangle2);
		g2.set("g2");
		g1.add(g2);

		g1.draw();
	}
}			
