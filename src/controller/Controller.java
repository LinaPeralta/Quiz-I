package controller;

import model.Logic;
import processing.core.PApplet;


public class Controller {
	
    Logic logic;

	PApplet app;
	

	public Controller(PApplet app) {	
		this.app=app;
		
		logic = new Logic(app);
	}

	public void draw() {
		logic.draw();

	}

	public void stopMove() {

	}

	public void distShapes() {

	}

	public void newShape() {

	}

}
