package ar.edu.unq.po2.tp3;

public class Punto {
	private float x;
	private float y;
	
	public Punto(float x,float y) {
		super();
		this.setXY(x, y);
	}
	
	public void setXY (float x, float y) {
		
		this.setX(x);
		this.setY(y);
		
	}
	
	
	// Getter y Setter X
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	//////////////////////////
	
	//Getter y setter Y
	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	////////////////////////////
}
