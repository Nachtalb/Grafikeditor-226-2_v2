package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Bogen extends Figur {
	private int width;
	private int height;
	private int startAngle;
	private int arcAngle;
	
	public Bogen(Point ersterPunkt, Point zweiterPunkt) {
		this.startAngle = (int) ersterPunkt.getX();
		this.arcAngle = (int) ersterPunkt.getY();
		
		this.width = (int) zweiterPunkt.getX();
		this.height = (int) zweiterPunkt.getY();
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getTiknes() {
		return tiknes;
	}
	public void setTiknes(int tiknes) {
		this.tiknes = tiknes;
	}	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getStartAngle() {
		return startAngle;
	}
	public void setStartAngle(int startAngle) {
		this.startAngle = startAngle;
	}
	public int getArcAngle() {
		return arcAngle;
	}
	public void setArcAngle(int arcAngle) {
		this.arcAngle = arcAngle;
	}
	

	@Override
	public void zeichne(Graphics g){
		g.drawArc(point1_x, point1_y, width, height, startAngle, arcAngle);
	}
}
