package com.DrawShapes;

public class DrawShape {
	Shape shape;
	
	public DrawShape(Shape shape) {
		this.shape = shape;
	}
	
	public void go() {
		shape.draw();
	}
}
