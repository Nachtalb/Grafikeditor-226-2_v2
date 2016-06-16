package model;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figur {

	protected int point1_x;
	protected int point1_y;
	protected Color color;
	protected int tiknes;
	
	public abstract void zeichne(Graphics g);
	
}
