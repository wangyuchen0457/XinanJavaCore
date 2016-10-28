package com.OodDemo;

public class Circle {
	double radius = 0;
	public Circle() {
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle.Draw draw = circle.new Draw();
		draw.drawSahpe();
		circle.drawSahpe();
	}
	public void drawSahpe() {
		System.out.println("DrawShape");
	}
	    class Draw { // 内部类
		public void drawSahpe() {
			System.out.println("drawshape");
		    }
	     }
}
