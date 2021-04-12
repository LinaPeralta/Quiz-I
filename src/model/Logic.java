package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	PApplet app;

	int R, G, B;

	String[] words;

	// Circle circulo;

	ArrayList<Circle> circle;
	ArrayList<Square> square;
	ArrayList<Triangle> triangle;

	public Logic(PApplet app) {

		this.app = app;

		words = app.loadStrings("./Text/Text.txt");
		circle = new ArrayList<Circle>();
		square = new ArrayList<Square>();
		triangle = new ArrayList<Triangle>();

		split();
	}

	public void split() {

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("Circulo")) {
				circle.add(new Circle(app, words[i]));
			}

			if (words[i].contains("Cuadrado")) {
				square.add(new Square(app, words[i]));
			}

		}

	}

	public void draw() {

		for (int i = 0; i < circle.size(); i++) {
			Circle actual = circle.get(i);
			circle.get(i).draw();
			circle.get(i).move();
		}

		for (int i = 0; i < square.size(); i++) {
			Square actual = square.get(i);
			square.get(i).draw();
			square.get(i).move();

		}

		for (int i = 0; i < triangle.size(); i++) {
			Triangle actual = triangle.get(i);
			triangle.get(i).draw();
			triangle.get(i).move();

		}

		distShapes();

	}
	public void stopMove() {
		
		for (int j = 0; j < circle.size(); j++) {
		
//			if (dist(app.mouseX, circle.get(j).getPosX(), app.mouseY, circle.get(j).getPosY())<circle.get(j).getSize()) {
//				circle.get(j).setStopMove(!circle.get(j).isStop());
//			}
	}	
		

	}

	public void distShapes() {
		

//
//		// colision entre circulos y cuadrados
//
//		for (int i = 0; i < square.size(); i++) {
//		
//			
//			Square square = square.get(i);
//			for (int j = 0; j < circle.size(); j++) {
//				// Circle variable
//				Circle circle = circle.get(j);
//
//				// Distance between shapes
//				if (app.dist(square.getPosX(), square.getPosY(), circle.getPosX(), circle.getPosY()) < circle.getSize()
//						/ 2) {
//					crash1 = true;
//					if (crash1) {
//						// Addition of both of the values that crashed
//						int valueTriangle = additionValues(square.getValue(), circle.getValue());
//						// Adding triangle as a result of the crash
//						triangleList.add(new Triangle(app, square.getPosX(), square.getPosY(), square.getDir1(),
//								square.getDir2(), valueTriangle, square.getSpeed()));
//						// Removing the shapes that crashed
//						squareList.remove(square);
//						circleList.remove(circle);
//						crash1 = false;
//					}
//				}
//			}
//		}
//
	}


	public void newShape() {

	}

}
