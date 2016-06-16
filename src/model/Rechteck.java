package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rechteck extends Figur {
	private int height;
	private int width;
	private int point2_y;
	private int point2_x;

	public Rechteck(Point ersterPunkt, Point zweiterPunkt) {
		this.point1_x = (int) ersterPunkt.getX();
		this.point1_y = (int) ersterPunkt.getY();

		this.point2_x = (int) zweiterPunkt.getX();
		this.point2_y = (int) zweiterPunkt.getY();

		if ((int) ersterPunkt.getX() > (int) zweiterPunkt.getX()) {
			this.width = (int) ersterPunkt.getX() - (int) zweiterPunkt.getX();
		} else {
			this.width = (int) zweiterPunkt.getX() - (int) ersterPunkt.getX();
		}

		if ((int) ersterPunkt.getY() > (int) zweiterPunkt.getY()) {
			this.height = (int) ersterPunkt.getY() - (int) zweiterPunkt.getY();
		} else {
			this.height = (int) zweiterPunkt.getY() - (int) ersterPunkt.getY();
		}
	}

	public Rechteck(int x, int y, int breite, int hoehe) {
		this.point1_x = x;
		this.point1_y = y;

		this.width = breite;
		this.height = hoehe;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
	
	private int calculateAngleX(){
		if (point1_x > point2_x) {
			return point2_x;
		} else {
			return point1_x;
		}
	}

	private int calculateAngleY(){
		if (point1_y > point2_y) {
			return point2_y;
		} else {
			return point1_y;
		}
	}
	
	@Override
	public void zeichne(Graphics g) {
		int x = calculateAngleX();
		int y = calculateAngleY();
		g.drawRect(x, y, width, height);
	}
	
	@Override
	public String toString(){
		return "Rechteck: x1 = "+getPoint1_x()+" y1 = "+getPoint1_y();
		
	}

	private int getPoint1_y() {
		return point1_y;
	}

	private int getPoint1_x() {
		return point1_x;
	}
}
