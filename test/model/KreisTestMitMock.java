package model;

import org.junit.Test;

import java.awt.*;

import static org.mockito.Mockito.*;

public class KreisTestMitMock {
	Graphics g = mock(Graphics.class);

	@Test
	public void testZeichne() {
		Kreis kreis = new Kreis(150, 150, 50);
		kreis.zeichne(g);
		verify(g, times(1)).drawOval(150, 150, 50, 50);
	}

}
