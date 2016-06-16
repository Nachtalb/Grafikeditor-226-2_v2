package model;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends Figur {
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
	
	public Text(int x, int y, String text, int tiknes, Color color){
		this.point1_x = x;
		this.point1_y = y;
		this.tiknes = tiknes;
		this.color = color;
		this.text = text;
	}	
	
	@Override
	public void zeichne(Graphics g){
		g.drawString(text, point1_x, point1_y);
	}
}
