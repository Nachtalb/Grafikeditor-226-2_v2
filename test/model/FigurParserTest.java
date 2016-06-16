package model;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FigurParserTest {
    private FigurDAO dao;
    private FigurParser fp;
    private List<Figur> figuren;

    @Before
    public void setup() {
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
        figuren = fp.parse();
    }

    @Test
    public void testParseFigurenSize() {

        assertEquals(3, figuren.size());
    }

    @Test
    public void testParseFigurenContains() {
//		System.out.println(figuren);
        assertEquals("Rechteck: x1 = 500 y1 = 100", figuren.get(0).toString());
        assertEquals("Kreis: x1 = 200 y1 = 100 durchmesser = 199", figuren.get(1).toString());
        assertEquals("Linie: x1 = 200 y1 = 500", figuren.get(2).toString());
    }
}
