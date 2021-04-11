package view;

import java.util.ArrayList;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	
	}
	
	Controller controller;

	@Override
	public void settings() {
		size(500, 500);
	}
	
	@Override
	public void setup() {
		
		controller = new Controller(this);	
	}
	
	@Override
	public void draw() {
		background(255);
		
		
		//rect(250, 250, 150, 40);
	  controller.draw();
		
		
	}
	
	@Override
	public void mousePressed() {
	
	}


}
