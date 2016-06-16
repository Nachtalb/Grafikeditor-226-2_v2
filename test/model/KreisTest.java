package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class KreisTest {
	private GraphicsStub g = new GraphicsStub();
		

	@Test
	public void testZeichne() {
		Kreis kreis = new Kreis(150, 150, 50);
		kreis.zeichne(g);
		assertEquals(1, g.numberOfDrawOvalCalls);	
		assertEquals(150, g.x);
		assertEquals(150, g.y);
		assertEquals(50, g.width);
		assertEquals(50, g.height);
	}

}
