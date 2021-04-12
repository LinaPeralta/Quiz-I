package controller;

import model.Circle;
import model.Logic;
import model.Square;
import processing.core.PApplet;

public class Controller {

	Logic logic;
	PApplet app;
	boolean filtro;

	public Controller(PApplet app) {
		this.app = app;

		logic = new Logic(app);
		filtro = true;
	}

	public void draw() {
		logic.draw();

	}

	public void newFigure() {


	}
 
	public void stopMove() {

	}

	public void distShapes() {

	}

	public void newShape() {

	}

}
