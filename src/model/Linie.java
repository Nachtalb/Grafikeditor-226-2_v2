package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Linie extends Figur {
	private int point2_x;
	private int point2_y;

	public int getPoint1_x() {
		return point1_x;
	}
	public void setPoint1_x(int point1_x) {
		this.point1_x = point1_x;
	}
	public int getPoint1_y() {
		return point1_y;
	}
	public void setPoint1_y(int point1_y) {
		this.point1_y = point1_y;
	}
	public int getPoint2_x() {
		return point2_x;
	}
	public void setPoint2_x(int point2_x) {
		this.point2_x = point2_x;
	}
	public int getPoint2_y() {
		return point2_y;
	}
	public void setPoint2_y(int point2_y) {
		this.point2_y = point2_y;
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
	
	public Linie(Point ersterPunkt, Point zweiterPunkt) {
		this.point1_x = (int) ersterPunkt.getX();
		this.point1_y = (int) ersterPunkt.getY();
		
		this.point2_x = (int) zweiterPunkt.getX();
		this.point2_y = (int) zweiterPunkt.getY();
		
		color = new Color(0, 0, 0);
		tiknes = 1;
	}

	public Linie(int x, int y, int endx, int endy) {
		this.point1_x = x;
		this.point1_y = y;
		
		this.point2_x = endx;
		this.point2_y = endy;
		
		color = new Color(0, 0, 0);
		tiknes = 1;
	}
	@Override
	public void zeichne(Graphics g){
		g.drawLine(point1_x, point1_y, point2_x, point2_y);
	}
	
	@Override
	public String toString(){
		return "Linie: x1 = "+getPoint1_x()+" y1 = "+getPoint1_y();
		
	}
}
