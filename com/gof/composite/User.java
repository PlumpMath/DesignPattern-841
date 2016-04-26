package com.gof.composite;

public class User{
	public static void main(String[] args){
		CompositeGraphics g1 = new CompositeGraphics();
		Rectangle rectangle1 = new Rectangle();
		rectangle1.set(1, 1, 10, 10);
		g1.add(rectangle1);
		g1.set("g1");

		CompositeGraphics g2 = new CompositeGraphics();
		Triangle triangle1 = new Triangle();
		Rectangle rectangle2 = new Rectangle();
		triangle1.set(2, 2, 2, 2);
		rectangle2.set(3, 3, 3, 3);
		g2.add(triangle1);
		g2.add(rectangle2);
		g2.set("g2");
		g1.add(g2);
		
		CompositeGraphics g3 = new CompositeGraphics();
		Circle circle1 = new Circle();
		circle1.set(4, 4, 4);
		g3.add(circle1);
		g3.set("g3");
		g1.add(g3);

		g1.draw();
	}
}			
