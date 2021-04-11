package model;

import processing.core.PApplet;

public abstract class Shapes {
	
	protected String words;
	PApplet app;
	protected int tam, posX, posY, directionA, directionB, value;

	public Shapes(PApplet app,  String words) {
		
		this.app = app;
		this.words = words;	

	}

	public abstract void draw();

	public void move() {
		
		posX += directionA;
		posY += directionB;
		
	}
	
	public void limit() {
		
		if(posX-tam/2<0) {
			directionA = 1;
		}
		
		if(posY-tam/2<0) {
			directionA = 1;
		}
		
		if(posX+tam/2>500) {
			directionA = -1 ;
		}
		
		if(posY+tam/2>500) {
			directionA = -1;
		}
		
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
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
	
	
	
}
