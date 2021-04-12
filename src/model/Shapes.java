package model;

import processing.core.PApplet;

public abstract class Shapes {
	
	protected String words;
	PApplet app;
	protected int tam, posX, posY, directionA, directionB, value,speed;
	protected boolean stop;

	public Shapes(PApplet app,  String words) {
		
		this.app = app;
		this.words = words;	

	}

	public abstract void draw();
	
	public 	Shapes() {
		this.stop = true;

		
		this.tam = (int) (Math.random()*60+20);
		this.posX = (int) (Math.random()*480+20);
		this.posY = (int) (Math.random()*480+20);
		this.directionA = (int) (Math.random()*2+0);
		//Direction for the shapes randomly made
		if (directionA == 0) {
			directionA = 1;
		} else {
			directionA = -1;
		}
		this.directionB = (int) (Math.random()*2+0);
		if (directionB == 0) {
			directionB = 1;
		} else {
			directionB = -1;
		}
		this.value = (int) (Math.random()*20+1);
		
		
	
		speed = (int)(Math.random()*4+1);
	}
	
	

	public void move() {
		
		if (stop) {
			posX += (speed * directionA);
			posY += (speed * directionA);
			
			if (posX < 0 || posX > 800) {
				directionA = directionA*(-1);
			}
			
			if (posY < 0 || posY > 600) {
				directionB = directionB*(-1);
			}
		}
		
	}
	
	
//	public void limit() {
//		
//		if(posX-tam/2<0) {
//			directionA = 1;
//		}
//		
//		if(posY-tam/2<0) {
//			directionA = 1;
//		}
//		
//		if(posX+tam/2>500) {
//			directionA = -1 ;
//		}
//		
//		if(posY+tam/2>500) {
//			directionA = -1;
//		}
//		
//	}

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
