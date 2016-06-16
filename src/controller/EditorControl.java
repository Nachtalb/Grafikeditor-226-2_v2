package controller;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import view.EditorFrame;
import model.Figur;
import model.Kreis;
import model.Linie;
import model.Rechteck;

public final class EditorControl {
	private char figurTyp = 'l';
	private Point ersterPunkt;
	private ArrayList<Figur> figures = new ArrayList<Figur>();
	private EditorFrame editorFrame;

	public EditorControl(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

	public void allesNeuZeichnen(Graphics g) {
		for(Figur f : figures){
			f.zeichne(g);			
		}
	}

	public void setFigurTyp(char figurTyp) {
		this.figurTyp = figurTyp;

	}

	public void setErsterPunkt(Point ersterPunkt) {
		this.ersterPunkt = ersterPunkt;
	}

	public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
		if (figurTyp == 'l') {
			Linie linie = new Linie(ersterPunkt, zweiterPunkt);
			figures.add(linie);
		} else if (figurTyp == 'k') {
			Kreis kreis = new Kreis(ersterPunkt, zweiterPunkt);
			figures.add(kreis);
		} else if (figurTyp == 'r') {
			Rechteck rechteck = new Rechteck(ersterPunkt, zweiterPunkt);
			figures.add(rechteck);
		} else {
			figurTyp = 'l';
		}
		editorFrame.neuZeichnen();
	}
}
