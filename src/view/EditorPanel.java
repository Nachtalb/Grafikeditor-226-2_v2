package view;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import controller.EditorControl;

@SuppressWarnings("serial")
public final class EditorPanel extends JPanel {

	private EditorControl editorControl;

	EditorPanel(EditorControl control) {
		editorControl = control;
		addMouseListener(mouseListener);	}

	MouseListener mouseListener = new MouseAdapter() {

		@Override
		public void mouseReleased(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			Point point = new Point(x, y);
			editorControl.erzeugeFigurMitZweitemPunkt(point);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();

			Point point = new Point(x, y);
			editorControl.setErsterPunkt(point);
		}
	};

	// Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer
	// die repaint()-
	// Methode beim EditorFrame oder beim EditorPanel aufruft.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		editorControl.allesNeuZeichnen(g);
	}
}