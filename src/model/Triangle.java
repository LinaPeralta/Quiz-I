package model;

import processing.core.PApplet;

public class Triangle {

	protected int tam, posX, posY, directionA, directionB, value,speed,sides;
	int R,G,B;
	PApplet app;
	protected boolean stop;

	public Triangle(PApplet app) {
		
		this.app=app;
		
		R = 190; 
		G = 78;
		B = 50;
		
	}

	public void draw() {
		app.triangle(posX-sides, posY+sides, posX, posY-sides, posX+sides, posY+sides);
		//app.triangle(posX, posY - tam / 2, posX - tam / 2, posY + tam / 2, posX + tam / 2, posY + tam / 2);
		app.fill(R,G,B);
		app.textSize(tam - 30);
		app.text(value + "", posX, posY);

	}

	public void move() {
		if (stop) {
			posX += (speed * directionA);
			posY += (speed *  directionB);
			
			if (posX < 0 || posX > 500) {
				directionA = directionA*(-1);
			}
			
			if (posY < 0 || posY > 500) {
				 directionB =  directionB*(-1);
			}
		}

	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDirectionA() {
		return directionA;
	}

	public void setDirectionA(int directionA) {
		this.directionA = directionA;
	}

	public int getDirectionB() {
		return directionB;
	}

	public void setDirectionB(int directionB) {
		this.directionB = directionB;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	
	
	
	

}
