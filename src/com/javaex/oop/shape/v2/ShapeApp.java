package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		Circle rad = new Circle (10, 20, 30);
		Rectangle rac = new Rectangle(10, 20, 100, 500);
		Point p = new Point(100, 200);
		
//		p.draw();
//		rac.draw();
//		rad.draw();
		Drawable objs[] = new Drawable[]{
			rad, rac, p
		};
		for(Drawable obj: objs) {
			if (obj instanceof Drawable) {
				obj.draw();
			}
		}
		
	}

}
