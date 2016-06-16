package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Kreis extends Figur {
	private int width;
	private int height;
	private int point2_x;
	private int point2_y;

	public Kreis(Point ersterPunkt, Point zweiterPunkt) {
		this.point1_x = (int) ersterPunkt.getX();
		this.point1_y = (int) ersterPunkt.getY();
		
		this.point2_x = (int) zweiterPunkt.getX();
		this.point2_y = (int) zweiterPunkt.getY();
		
		if ((int) ersterPunkt.getX() > (int) zweiterPunkt.getX()){
			this.width = (int) ersterPunkt.getX() - (int) zweiterPunkt.getX() ;
		}else{
			this.width = (int) zweiterPunkt.getX() - (int) ersterPunkt.getX();
		}
		
		if ((int) ersterPunkt.getY() > (int) zweiterPunkt.getY()){
			this.height = (int) ersterPunkt.getY() - (int) zweiterPunkt.getY() ;
		}else{
			this.height = (int) zweiterPunkt.getY() - (int) ersterPunkt.getY();
		}
		color = new Color(0, 0, 0);
		tiknes = 1;
	}
	public Kreis(int x, int y, int radius) {
		this.point1_x = x;
		this.point1_y = y;
		
		this.point2_x = x+radius;
		this.point2_y = y+radius;

		this.width = radius;
		this.height = radius;
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
	public int getPoint1_x() {
		return point1_x;
	}
	public void setPoint1_x(int point1_x) {
		this.point1_x = point1_x;
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
	@Override
	public void zeichne(Graphics g){
		int x = calculateAngleX();
		int y = calculateAngleY();
		g.drawOval(x, y, width, height);
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
	public String toString(){
		
		return "Kreis: x1 = "+getPoint1_x()+" y1 = "+getPoint1_y()+" durchmesser = "+getWidth();
		
	}
	private int getPoint1_y() {	
		return point1_y;
	}
}
