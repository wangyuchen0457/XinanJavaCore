package com.OodDemo;

import com.OodDemo.Circle;

public class Student {
	  public static void main(String[] args) {
    Circle circle=new Circle();
    Circle.Draw draw=circle.new Draw();
    draw.drawSahpe();
    circle.drawSahpe();
	  }
}