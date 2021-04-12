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

//		if (filtro == true) {
//			Circle actual = new Circle((int) (10 + (Math.random() * 80)), mouseX, mouseY, 5,
//					(int) (Math.random() * 35));
//			logic.getCircle().add(actual);
//			filtro = false;
//		} else {
//			Square actual = new Square((int) (10 + (Math.random() * 80)), mouseX, mouseY, 5,
//					(int) ((1 + Math.random() * 35)));
//			logic.getSquare().add(actual);
//			filtro = true;
//		}
	

	}
 
	public void stopMove() {

	}

	public void distShapes() {

	}

	public void newShape() {

	}

}
