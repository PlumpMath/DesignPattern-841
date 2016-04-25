package com.gof.composite;

import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

public class CompositeGraphics extends Graphic{
	private List<Graphic> graphics = new ArrayList<Graphic>();
	private String name = "";

	public void draw(){
		System.out.println("this is " + name + " Composite");
		for(Graphic graphic: graphics){
			graphic.draw();
		}
	};

	public void set(String name){
		this.name = name;
	}

	public void add(Graphic graphic){
		this.graphics.add(graphic);
	}
}
