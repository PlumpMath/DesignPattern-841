package com.gof.composite;

import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

public class CompositeGraphics extends MyGraphics{
	private List<MyGraphics> graphics = new ArrayList<MyGraphics>();
	private String name = "";

	public void draw(){
		System.out.println("this is " + name + " Composite");
		for(MyGraphics graphic: graphics){
			graphic.draw();
		}
	};

	public void set(String name){
		this.name = name;
	}

	public void add(MyGraphics graphic){
		this.graphics.add(graphic);
	}
}
